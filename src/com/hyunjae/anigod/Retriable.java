package com.hyunjae.anigod;

import java.io.IOException;

public interface Retriable<T> {
    T execute() throws IOException;
}
