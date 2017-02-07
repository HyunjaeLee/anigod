import com.hyunjae.anigod.BuilderManager;

public class Main {

    public static void main(String[] args) throws Exception {
        BuilderManager builderManager = new BuilderManager();
        builderManager.build();
        builderManager.getSeriesList().forEach(System.out::println);
        builderManager.getEpisodeList().forEach(System.out::println);
    }
}
