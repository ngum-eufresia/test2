
/**
 * Write a description of test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test2 {
    public void findGene(String dna){
        int allStrand=0;
        int length= dna.length();
        int count=0;
        int current=0;
        while(current<=length){
       int  currentIndex=dna.indexOf("CTG");
        if(currentIndex==-1){
            break;
        }
        else {count = count +1;
        }
        System.out.println(count);
       currentIndex=dna.indexOf (currentIndex,currentIndex+3);
      current= current + 1;
       
    }
    
}
 public void testOn(String dna){
     System.out.println("Testing printAllGene on " + dna); 
     findGene(dna); 
    }
    public void test(){
        testOn("ADDDCTGSSSSDDCTDDDCTG");
        testOn ("");
}

}