/**
 * Created by liujm on 2017/11/22.
 */
public class chengkai {

    public void message(huitiao huitiao,String question) throws InterruptedException {
        System.out.println("家铭的问题"+question);

        Thread.sleep(5000);
        String result="答案是2";

        huitiao.jieguo(result);

    }

}
