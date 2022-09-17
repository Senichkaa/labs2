package Task1;

import java.util.Iterator;
class MyIterator implements Iterator {
        private int index = 0;
        private Queue ownQueue;

    public MyIterator(Queue ownQueue) {
        this.ownQueue = ownQueue;
    }

    @Override
        public boolean hasNext() {
            return index < ownQueue.size();
        }

        @Override
        public Object next() {
            return ownQueue.getDataByIndex(index++);
        }
}
