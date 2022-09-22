public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for(int i=0;i<cycles.length;i++){
        if(cycles[i]<410){
            counts.lowCount=counts.lowCount+1;
        }
        else if(cycles[i]>410 && cycles[i]<909){
            counts.mediumCount=counts.mediumCount+1;
        }
        else if(cycles[i]>910){
            counts.highCount=counts.highCount+1;
            
        }
    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    // assert(counts.lowCount == 2);
    // assert(counts.mediumCount == 3);
    // assert(counts.highCount == 1);
    System.out.println("Done counting \n");
    System.out.println("LOW = "+counts.lowCount);
    System.out.println("MEDIUM = "+counts.mediumCount);
    System.out.println("HIGH = "+counts.highCount);
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
