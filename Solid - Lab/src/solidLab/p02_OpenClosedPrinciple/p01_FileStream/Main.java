package solidLab.p02_OpenClosedPrinciple.p01_FileStream;


public class Main {
    public static void main(String[] args) {
        StreamableFile streamableFile = new File();
        StreamableFile streamableFile1 = new Music();
        System.out.println(Progress.getCurrentPercent(streamableFile));
        System.out.println(Progress.getCurrentPercent(streamableFile1));
    }
}

