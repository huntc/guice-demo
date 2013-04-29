package com.typesafe.guice

import javax.inject.{Inject, Named}

@Named
class UserService @Inject()(userRepository: UserRepository) {
  def getUserRepository = userRepository
}
