import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
//https://www.scalatest.org/user_guide/selecting_a_style
class HelloWorld extends AnyFlatSpec with Matchers {
  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }
  "HelloWorld.returnANumber" should "return a number" in {
    HelloWorld.returnANumber(1) shouldBe 1
    HelloWorld.returnANumber(1) should be(1)
  }
}
