package solidLab.p02_OpenClosedPrinciple.p01_FileStream;

public class Progress {

    public Progress() {
    }

    public static int getCurrentPercent(StreamableFile streamableFile) {
        return streamableFile.getSent() * 100 / streamableFile.getLength();
    }
}
