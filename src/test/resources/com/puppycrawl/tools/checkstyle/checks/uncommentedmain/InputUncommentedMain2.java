/*
UncommentedMain
excludedClasses = (default)^$


*/

package com.puppycrawl.tools.checkstyle.checks.uncommentedmain;


public class InputUncommentedMain2
{
    private class PC {

        // uncommented main with depth 2
        public void main(String[] args)
        {
            System.identityHashCode("InputUncommentedMain.main()");
        }

        //lets go deeper
        private class PC2 {

            // uncommented main with depth 3
            public void main(String[] args)
            {
                System.identityHashCode("InputUncommentedMain.main()");
            }


        }
    }

    public static void main(String[] args)
    {
        System.identityHashCode("InputUncommentedMain.main()");
    }

}

interface IF {

    void main(String[] args);
}
