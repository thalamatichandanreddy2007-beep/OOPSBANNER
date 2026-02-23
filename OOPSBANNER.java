
    
    //STEPS TO PUSH INTO GITHUB 

    // U untracked 

    // write -------- git add . 
    
    // A ADDED


    // M MODIFIED 

    // git commit -m (after writing this give some comments )

    //now we should branch 
    //git checkout -b feature/UC1-PrintOOPS (this uc1 is from the given question )

    // NOW AGAIN DO GIT ADD AND GIT COMMIT(WRITE SOMETHING AFTER THIS)
    // NOW GIT PUSH 
    //git push origin feature/UC1-PrintOOPS (syntax: git push origin)
    // git status
    // git branch
    // git checkout -b main
    
public class OOPSBANNER {
    public static void main(String[] args) {
        String[] bannerLines = {
            String.join(" ", " **** ", " **** ", " ****** ", " ******** "),
            String.join(" ", " *  * ", " *  * ", " *    * ", " *        "),
            String.join(" ", " *  * ", " *  * ", " *    * ", " *        "),
            String.join(" ", " *  * ", " *  * ", " ****** ", " ******** "),
            String.join(" ", " *  * ", " *  * ", " *      ", "        * "),
            String.join(" ", " *  * ", " *  * ", " *      ", "        * "),
            String.join(" ", " **** ", " **** ", " *      ", " ******** ")
        };
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}