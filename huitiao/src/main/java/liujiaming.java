/**
 * Created by liujm on 2017/11/22.
 */
public class liujiaming implements huitiao{
    private chengkai ck;

    public liujiaming(chengkai ck){
        this.ck=ck;
    }

    public void Question(final String question){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ck.message(liujiaming.this,question);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        play();
                }

    public void play(){
        System.out.println("打游戏去");
    }

    @Override
    public void jieguo(String result){
        System.out.println("程凯给我返回的结果是:"+result);
    }



}




