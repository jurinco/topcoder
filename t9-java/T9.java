/*
 * SRM468-D2-500
 * SOLVED
 */

import java.util.*;

public class T9 {

	public String message(String[] part, String[] dict, String[] keystr) {
		HashMap<String, ArrayList<String>> invDict = buildInvDict(part, dict);

		StringBuilder res = new StringBuilder();
		StringBuilder keys = new StringBuilder();
		int word = 0;

		for (String s : keystr)
			for (char c : s.toCharArray()) {
				if (c == '0') {
					if (keys.length() > 0) {
						res.append(invDict.get(keys.toString()).get(word));

						keys.delete(0, keys.length());
						word = 0;
					}

					res.append(' ');
				} else if (c == '#') {
					word++;
				} else if (c == '*') {
					word += 5;
				} else {
					keys.append(c);
				}
			}

		if (keys.length() > 0) {
			res.append(invDict.get(keys.toString()).get(word));

			keys.delete(0, keys.length());
			word = 0;
		}

		return res.toString();
	}

	private HashMap<String, ArrayList<String>> buildInvDict(String[] part, String[] dict) {
		HashMap<Character, Character> invPart = buildInvParts(part);
		HashMap<String, ArrayList<String>> invDict = new HashMap<String, ArrayList<String>>();

		for (String word : dict) {
			String keys = keys(word, invPart);
			ArrayList<String> list = invDict.get(keys);

			if (list == null)
				invDict.put(keys, list = new ArrayList<String>());

			list.add(-1 - Collections.binarySearch(list, word), word);
		}

		return invDict;
	}

	private HashMap<Character, Character> buildInvParts(String[] part) {
		HashMap<Character, Character> invPart = new HashMap<Character, Character>();

		for (int i = 0; i < part.length; ++i)
			for (char c : part[i].toCharArray())
				invPart.put(c, (char) ('1' + i));

		return invPart;
	}

	private String keys(String word, HashMap<Character, Character> invPart) {
		StringBuilder res = new StringBuilder();

		for (char c : word.toCharArray())
			res.append(invPart.get(c));

		return res.toString();
	}

}
