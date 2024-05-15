package com.helloce3

import cats.effect.{IO, IOApp, Temporal}

import scala.concurrent.duration.*

object Main extends IOApp.Simple:
  def run: IO[Unit] =
//    StupidFizzBuzz.run
    val loop: IO[Unit] =
      for
        _ <- HelloWorld.say().flatMap(IO.println)
        _ <- IO.defer(Temporal[IO].sleep(1.seconds))
      yield ()

    loop.foreverM
