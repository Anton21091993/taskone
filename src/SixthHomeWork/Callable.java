package SixthHomeWork;

import FifthHomeWork.ISearchEngine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public interface Callable extends ISearchEngine {
    public static void main(String[] args) {
        ISearchEngine search;
        search=(text,word)->text+word;
        System.out.println(search);
    }
    ExecutorService executor = null;
    executor.execute(new Callable);
    Future<String> f1 = executor.submit(new java.util.concurrent.Callable<String>() {
        @Override
        public String call() throws Exception {
            return null;
        }
    })


}
