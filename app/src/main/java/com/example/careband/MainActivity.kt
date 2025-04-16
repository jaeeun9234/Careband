package com.example.careband

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.careband.ui.theme.CareBandTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 여기서 방금 만든 XML과 연결됨

        val signupButton = findViewById<Button>(R.id.signupButton)
        val loginButton = findViewById<Button>(R.id.loginButton)

        signupButton.setOnClickListener {
            // 회원가입 화면으로 이동
            startActivity(Intent(this, SignupActivity::class.java))
        }

        loginButton.setOnClickListener {
            // 로그인 화면으로 이동
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CareBandTheme {
        Greeting("Android")
    }
}