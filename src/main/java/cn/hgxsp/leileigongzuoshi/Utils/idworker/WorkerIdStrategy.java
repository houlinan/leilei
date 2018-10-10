package cn.hgxsp.leileigongzuoshi.Utils.idworker;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
