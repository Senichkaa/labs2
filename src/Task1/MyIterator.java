package Task1;

import java.util.Iterator;
class MyIterator implements Iterator<Integer> {
        private int index = 0;
        private final Queue ownQueue;

    public MyIterator(final Queue ownQueue) {
        this.ownQueue = ownQueue;
    }

    @Override
        public boolean hasNext() {
            return index < ownQueue.size();
        }

        @Override
        public Integer next() {
            return ownQueue.getDataByIndex(index++);
        }
}
