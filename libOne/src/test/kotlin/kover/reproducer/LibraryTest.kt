package kover.reproducer

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.Test
import kotlin.test.assertTrue

@ExtendWith(MockKExtension::class)
class LibraryTest {

    @MockK
    lateinit var mockedNumber: Number

    @Test fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 2, 3, 4, 5])
    fun someLibraryMethod(num: Int) {
        every { mockedNumber.toInt() } returns 0
        assertTrue(num > mockedNumber.toInt())
    }
}
