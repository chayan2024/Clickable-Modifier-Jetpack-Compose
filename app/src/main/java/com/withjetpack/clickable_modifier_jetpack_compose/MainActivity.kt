package com.withjetpack.clickable_modifier_jetpack_compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.withjetpack.clickable_modifier_jetpack_compose.ui.theme.ClickableModifierJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickableModifierJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    ClickableModifier()                }
            }
        }
    }
}

@Composable
fun ClickableModifier() {

    val context = LocalContext.current

    Row(Modifier) {

        Column(
            modifier = Modifier
                .weight(1f)
                .background(Color(0xFF1E88E5))
                .padding(15.dp)
                .clickable(onClick = {
                    Toast
                        .makeText(context, "Clicked me", Toast.LENGTH_SHORT)
                        .show()
                }),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = "Click Me"
            )
        }
      Spacer(modifier = Modifier.padding(all = 20.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .background(Color(0xFF1E88E5))
                .padding(15.dp)
                .clickable(onClick = {
                    Toast
                        .makeText(context, "Clicked me", Toast.LENGTH_SHORT)
                        .show()
                }),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = "Click Me"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ClickableModifierJetpackComposeTheme {
        ClickableModifier()
    }
}