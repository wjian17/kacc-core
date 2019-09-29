package knowledge.accumulation.springcloud.service;


import knowledge.accumulation.springcloud.domain.User;

/**
 * 测试Service
 * <p>
 * create by wangjian at 2018/3/3-下午1:46
 * contact by wangjian@supplyfintech.com
 */
public interface DemoService {

    /**
     * 除法运算
     *
     * @param numberA 第一个数
     * @param numberB 第二个数
     * @return 结果
     */
    double division(int numberA, int numberB) throws Exception;

    /**
     * 打印方法
     *
     * @return 一个字符串
     */
    String print();

    /**
     * 求和方法
     *
     * @param numberA 第一个数
     * @param numberB 第二个数
     * @return 两数之和
     */
    int sum(int numberA, int numberB);

    User getUserInfo();
}
