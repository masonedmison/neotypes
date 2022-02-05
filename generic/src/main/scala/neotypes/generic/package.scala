package neotypes

import neotypes.mappers.ValueMapper
import shapeless.HNil

package object generic extends OrphanInstances
  
trait OrphanInstances {
  implicit final val HNilMapper: ValueMapper[HNil] =
    ValueMapper.const(HNil)

}
