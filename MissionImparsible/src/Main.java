/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu

  Is parse an online algorithm? Why or why not?
    -I think parse would be an offline algorithm because you would have to feed the information
       in order for it to work.

  -Given N tags. What is the runtime of parse? Why?
        Given N tags the runtime of parse is O(n) because parse will have to pass through every tag.
*/
class Main {

    public static void main(String[] args) {
        // These are here as a reference, I will use different test cases.

        Stack s1 = new Stack();

        String[] testCases = {
                "<html>\nThis is my awesome webpage!\n</html>\n",
                "<html>\n<body>\n<b>CS241</b> is awesome!\n</html>\n</body>\n",
                "<p><b>Here is some text!</b>",
                "<p><b><i>Italics and bold!</i>just bold</b></p>",
                "<tag_I_made_up>Professor Carmine!</tag_I_made_up>"
        };

        int i = 0;
        char c = testCases[i].charAt(0);

        for (String test : testCases) {

            System.out.println(parse(test));
        }
    }

    public static boolean parse(String html) {

        // You need to put your code here
        if(c == '/'){

            s1.pop();
        }
        else {

            s1.push(testCases[i]);
        }

        //if arr[i] does not start with '/' then push, return false. if it starts with '/' then pop, return true
        //compare if the current tag is the same as the previous popped tag


        return false;
    }
}