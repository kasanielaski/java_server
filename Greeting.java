package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final Integer size;
    private final int[] ar;
    private final Integer summ;

    public Greeting(long id, String content, Integer size, int[] ar, Integer summ) {
        this.id = id;
        this.content = content;
        this.size = size;
        this.ar = ar;
        this.summ = summ;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Integer getSize() {
        return size;
    }

    public int[] getAr() {
        return ar;
    }

    public Integer getSumm(){
        return summ;
    }
}
