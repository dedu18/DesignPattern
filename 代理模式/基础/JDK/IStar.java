package 代理模式.基础.JDK;

public interface IStar {
    /**
     * 这是代理类和被代理类的抽象，外界不是直接与被代理类打交道而是直接和代理类通信
     * 代理类提供的接口和被代理类提供的接口一致
     */
    void sing();
}
