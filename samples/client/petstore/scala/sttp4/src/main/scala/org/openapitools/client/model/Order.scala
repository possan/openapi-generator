/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

    import java.time.OffsetDateTime

  /**
   *                     Pet Order
   *                 An order for a pets from the pet store
   */
            case class Order(
                id: Option[Long] = None,
                petId: Option[Long] = None,
                quantity: Option[Int] = None,
                shipDate: Option[OffsetDateTime] = None,
                    /* Order Status */
                status: Option[OrderEnums.Status] = None,
                complete: Option[Boolean] = None
            )

            object OrderEnums {

                    type Status = Status.Value
                    object Status extends Enumeration {
                        val Placed = Value("placed")
                        val Approved = Value("approved")
                        val Delivered = Value("delivered")
                    }

            }
