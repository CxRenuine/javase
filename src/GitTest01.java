/**
 * 1.版本控制：即版本迭代
 */
public class GitTest01 {
    public static void main(String[] args) {
        System.out.println("cx");

        /**
         * 对第一个版本的代码进行修改
         */
        System.out.println("hello change01");

        /**
         * 对第二个版本进行修改
         */
        System.out.println("hello change02");

        /**
         * 在hot-fix分支上对代码进行第一次修改
         */
        System.out.println("hello hot-fix change01");

        /**
         * 在hot-fix分支上对代码进行修改为了演示代码冲突
         */
        System.out.println("hello hot-fix conflictChange");

        /**
         * 在master分支上对代码进行修改演示代码冲突
         */
        System.out.println("master changeConflict");
    }

}
