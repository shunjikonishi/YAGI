package utils

import com.ning.http.client.AsyncHttpClient

object AsyncHttpClientHolder {
  implicit val instance: AsyncHttpClient = new AsyncHttpClient()
}