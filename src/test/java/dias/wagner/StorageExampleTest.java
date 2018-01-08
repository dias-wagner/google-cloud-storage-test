package dias.wagner;

import org.junit.Test;

public class StorageExampleTest {

    @Test
    public void testDownload() throws Exception {
        StorageExample.main("download", "gcloud-storage-test", "textos-artistas.txt", "/tmp/textos-artistas.txt");
    }
}
