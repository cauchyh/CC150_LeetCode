/*
	Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
click to show corner cases.

Corner Cases:
Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, 
such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
*/

public class SimplifyPath
{
	public static String simplifyPath(String path)
	{
		if (path.equals("/../") || path.equals("/"))
		{
			return "/";
		}
		int start = -1;
        int end = -1;
        boolean searchEnd = true;
        String res = "";
        for (int i = path.length()-1; i>=0; i--)
        {
            if (path.charAt(i) == '/' && searchEnd == true)
            {
                if (i-1 > 0 && (path.charAt(i-1) == '/' || path.charAt(i-1) == '.'))
                {
                    searchEnd = true;
                }
                else
                {
                    end = i;
                    searchEnd = false;
                }
            }
            else if (path.charAt(i) == '/' && searchEnd == false)
            {
                start = i;
                res = path.substring(start, end) + res;
                if (i-1 > 0 && (path.charAt(i-1) == '/' || path.charAt(i-1) == '.'))
                {
                    searchEnd = true;
                }
                else
                {
                	break;
                }
            }
        }
        if (start == -1 && end != -1)
        {
            return "/";
        }
        return res;
	}
}