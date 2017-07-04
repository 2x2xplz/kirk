package com.automation.remarks.kirk.test.examples.simple

import com.automation.remarks.kirk.Browser
import com.automation.remarks.kirk.conditions.have
import com.automation.remarks.kirk.test.BaseTest
import com.automation.remarks.kirk.test.examples.simple.pages.SecondPage
import com.automation.remarks.kirk.test.examples.simple.pages.StartPage
import org.testng.annotations.Test


/**
 * Created by sergey on 02.07.17.
 */
class SimplePageObjectTest : BaseTest() {

    @Test fun testCanNavigateToAnotherPage() {
        Browser.drive {
            to(::StartPage) {
                element(".paginator").element("a").click()
            }.thanAt(::SecondPage) {
                element("#header").should(have.text("Second page"))
            }
        }
    }
}