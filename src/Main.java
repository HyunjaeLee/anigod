import com.hyunjae.anigod.BuilderManager;

public class Main {

    public static void main(String[] args) throws Exception {
        long t1 = System.currentTimeMillis();

        BuilderManager builderManager = new BuilderManager();
        builderManager.build();

        long t2 = System.currentTimeMillis();

        builderManager.getSeriesList().forEach(System.out::println);
        builderManager.getEpisodeList().forEach(System.out::println);

        System.out.println(t2 - t1);
    }
}
