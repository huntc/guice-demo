package com.typesafe.guice

import com.google.inject.{AbstractModule, Guice}
import com.typesafe.guice.mydb.MyDbUserRepository

object Application {

  private val injector = Guice.createInjector(new AbstractModule() {
    override def configure() {
      bind(classOf[UserRepository]).to(classOf[MyDbUserRepository])
    }
  })

  private val userService = injector.getInstance(classOf[UserService])

  def main(args: Array[String]) {
    if (userService.getUserRepository != null) {
      println("All is well")
    }
  }
}
