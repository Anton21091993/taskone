package SixthHomeWork;

import FifthHomeWork.ISearchEngine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public interface Callable extends ISearchEngine {




    ExecutorService executor = null;
    executor.execute(new Callable);
    Future<String> f1 = executor.submit(new java.util.concurrent.Callable<String>() {
        @Override
        public String call() throws Exception {
            return null;
        }
    }


}
