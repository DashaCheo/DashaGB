public class HW6<bstract> {
    bstract class Animal {
        protected int _length;
        protected double _height;

        abstract void run(int length);
        abstract void jump(double height);

        static void showResult(Object obj, boolean result) {
            System.out.println(obj.getClass().getName() + " : " + result);
        }
    }

    class Cat extends Animal {
        @Override
        void run(int length) {
            boolean result = length <= 200;
            if (result) _length = length;
            showResult(this,result);
        }
        @Override
        void jump(double height) {
            boolean result = height <= 2;
            if (result) _height = height;
            showResult(this,result);
        }

    }

    class Dog extends Animal {
        private int _lengthSwim;
        private int maxLength;

        Dog() {
            maxLength = Math.random() > 0.5 ?  400 : 600;
        }

        int getMAxLengtx() {
            return maxLength;
        }

        void swim(int length) {
            boolean result = length <= 10;
            if (result) _lengthSwim = length;
            showResult(this,result);
        }
        @Override
        void run(int length) {
            boolean result = length <= maxLength;
            if (result) _length = length;
            showResult(this,result);
        }
        @Override
        void jump(double height) {
            boolean result = height <= 0.5;
            if (result) _height = height;
            showResult(this,result);
        }
    }

}

