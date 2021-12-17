package com.hexaware.sharedlib;

public class SharedLibrary {
  def steps
  
  public SharedLibrary(steps) {
    this.step = steps
  }
  public void startBuild() {
    steps.echo "Hello World"
  }
}
