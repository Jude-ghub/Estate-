 package com.example.estate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Paragraph
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estate.ui.theme.EstateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

@Composable
fun Home() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // image
        Image(
            painter = painterResource(id = R.drawable.house),
            contentDescription = "",
            modifier = Modifier.run {
                size(300.dp)
                .clip(CircleShape)
            },
        )


        // homepage
        Text(
            text = "Estate+ Payment Platform",
            fontSize = 20.sp,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.absoluteOffset(10.dp,10.dp)
        )

        Text(
            text = "Manage your properties with ease.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.absoluteOffset(10.dp,10.dp)


            )
        // button
        // modifier; height,width,padding
        Row {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Red),
                shape = RoundedCornerShape(0),
                modifier = Modifier.fillMaxWidth(0.4f).
                absolutePadding(5.dp,5.dp,5.dp,5.dp).
                absoluteOffset(10.dp,10.dp)
            )
            {Text(text = "Sign up",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Serif,
            )

            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Red),
                shape = RoundedCornerShape(0),
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .absolutePadding(5.dp,5.dp,5.dp,5.dp)
                    .absoluteOffset(10.dp,10.dp)
            )
            {Text(text = "Sign in",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Serif,
            )

            }


        }

    }
}

@Composable
@Preview(showBackground = true)
fun HomePreview() {
    Home()
}
