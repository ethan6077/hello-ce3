package com.helloce3

import cats.effect.IO
import cats.effect.IOApp

object Main extends IOApp.Simple:

  // This is your new "main"!
  def run: IO[Unit] =
    HelloWorld.say().flatMap(IO.println)
