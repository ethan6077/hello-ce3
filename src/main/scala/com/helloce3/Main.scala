package com.helloce3

import cats.effect.IO
import cats.effect.IOApp

object Main extends IOApp.Simple:
  def run: IO[Unit] =
    StupidFizzBuzz.run
    HelloWorld.say().flatMap(IO.println).foreverM
