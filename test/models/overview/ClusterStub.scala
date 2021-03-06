package models.overview

import play.api.libs.json.JsValue

trait ClusterStub {

  def apply() = new ClusterOverview(clusterState, nodesStats, indicesStats, clusterSettings, aliases, clusterHealth, nodes, main)

  val clusterState: JsValue

  val nodesStats: JsValue

  val indicesStats: JsValue

  val clusterSettings: JsValue

  val aliases: JsValue

  val clusterHealth: JsValue

  val nodes: JsValue

  val main: JsValue

}
