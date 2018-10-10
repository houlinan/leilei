package cn.hgxsp.leileigongzuoshi.Utils.idworker;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
