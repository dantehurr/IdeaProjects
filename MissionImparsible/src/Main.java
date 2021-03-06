/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu

  Is parse an online algorithm? Why or why not?
    -I think parse would be an online algorithm because once information is being fed, it is not recording after reading.

  -Given N tags. What is the runtime of parse? Why?
        Given N tags the runtime of parse is O(n) because parse will have to pass through every tag.
*/
class Main {

    public static void main(String[] args) {
        // These are here as a reference, I will use different test cases.

        String[] testCases = {
                "<html>\nThis is my awesome webpage!\n</html>\n", // valid
                "<html>\n<body>\n<b>CS241</b> is awesome!\n</html>\n</body>\n", // not valid (tags in the wrong order at the end)
                "<p><b>Here is some text!</b>", // not valid (code ended before we closed </p>)
                "<p><b><i>Italics and bold!</i>just bold</b></p>", // valid
                "<tag_I_made_up>Professor Carmine!</tag_I_made_up>" // valid
        };

        for (String test : testCases) {

            System.out.println(parse(test));
        }

    }

    /*
    For parse, you have a lot to do there. There are a couple of ways:

You can go character by character (with a for loop) or use a while loop.
- Look for < and >
- You can use substring to get the tag
- If it DOES NOT have a / then push it onto the stack
- If it does, then remove the /, pop from the stack and compare the one from the stack with the one you just made.
     */

    public static boolean parse(String html) {
        // You need to put your code here

        Stack s1 = new Stack();

        int openLeftIndex = html.indexOf('<');
        int openRightIndex = html.indexOf('>') + 1;

        int closeLeftIndex = html.indexOf('<', openRightIndex);
        int closeRightIndex = html.indexOf('>', closeLeftIndex) + 1;

        String openTag = html.substring(openLeftIndex, openRightIndex);
        String closeTag = html.substring(closeLeftIndex, closeRightIndex);

        for(int i = 0; i < closeTag.length(); i++) {

            if(closeTag.charAt(1) != '/'){

                s1.push(html);
            }

        }

        return s1.isEmpty();
    }
}