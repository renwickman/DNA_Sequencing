
    //Determines whether there is a protein in a strand of DNA

    public class DNA {

        public static void main(String[] args) {

            //  -. .-.   .-. .-.   .
            //    \   \ /   \   \ /
            //   / \   \   / \   \
            //  ~   `-~ `-`   `-~ `-

            String dna1 = "ATGCGATACGCTTGA";
            String dna2 = "ATGCGATACGTGA";
            String dna3 = "ATTAATATGTACTGA";

            String dna = dna1;

            System.out.println(dna.length());
            int start = dna.indexOf("ATG");
            System.out.println(start);
            int stop = dna.indexOf("TGA");
            System.out.println(stop);

            if (start != -1 && stop != -1 && (start - stop) % 3 == 0){
                System.out.println("It is a protein");
                String protein = dna.substring(start, stop+3);
                System.out.println(protein);
            } else {
                System.out.println("Not a protein");
            }

        }



    }

