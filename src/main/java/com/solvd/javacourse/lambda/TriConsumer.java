package com.solvd.javacourse.lambda;

@FunctionalInterface
public interface TriConsumer<S1, S2, S3> {
	public abstract void accept(S1 s1, S2 s2, S3 s3);
}
