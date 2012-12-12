/*
 * SRM453.5-D2-250
 * SOLVED
 */

import java.util.*;

public class ToolsBox {

	public int countTools(String[] need) {
		HashSet<String> tools = new HashSet<String>();
		for (String furn : need)
			for (String tool : furn.split(" "))
				tools.add(tool);

		return tools.size();
	}

}
