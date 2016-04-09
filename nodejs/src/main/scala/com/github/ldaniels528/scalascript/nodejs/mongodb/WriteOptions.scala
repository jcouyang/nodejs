package com.github.ldaniels528.nodesjs.nodejs.mongodb

import com.github.ldaniels528.nodesjs.util.ScalaJsHelper._

import scala.scalajs.js

/**
  * Write Options
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait WriteOptions extends js.Object {
  var w: Int
}

/**
  * Write Options Companion
  * @author lawrence.daniels@gmail.com
  */
object WriteOptions {

  def apply(w: Int): WriteOptions = {
    val options = makeNew[WriteOptions]
    options.w = w
    options
  }

}