/*
 * Copyright (c) 2010-2018, sikuli.org, sikulix.com - MIT license
 */

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class FindResults {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FindResults(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FindResults obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_FindResults(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FindResults() {
    this(VisionProxyJNI.new_FindResults__SWIG_0(), true);
  }

  public FindResults(long n) {
    this(VisionProxyJNI.new_FindResults__SWIG_1(n), true);
  }

  public long size() {
    return VisionProxyJNI.FindResults_size(swigCPtr, this);
  }

  public long capacity() {
    return VisionProxyJNI.FindResults_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    VisionProxyJNI.FindResults_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return VisionProxyJNI.FindResults_isEmpty(swigCPtr, this);
  }

  public void clear() {
    VisionProxyJNI.FindResults_clear(swigCPtr, this);
  }

  public void add(FindResult x) {
    VisionProxyJNI.FindResults_add(swigCPtr, this, FindResult.getCPtr(x), x);
  }

  public FindResult get(int i) {
    return new FindResult(VisionProxyJNI.FindResults_get(swigCPtr, this, i), false);
  }

  public void set(int i, FindResult val) {
    VisionProxyJNI.FindResults_set(swigCPtr, this, i, FindResult.getCPtr(val), val);
  }

}
