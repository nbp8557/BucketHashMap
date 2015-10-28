Questions to ask

Should the Bucket class implement a ReadWriteLock?
    If so that only forces you to implement 2 methods
    public Lock readLock() {
        return null;
    }

    public Lock writeLock() {
        return null;
    }

    I am then supposed to to return a lock which i use in the 4 provided methods within the bucket?
    Pair<K, V> getPair(int i) {
        ...
    }

    void putPair(int i, Pair<K, V> pair) {
        ...
    }

    void addPair(Pair<K, V> pair) {
        ...
    }

    void removePair(int index) {
        ...
    }