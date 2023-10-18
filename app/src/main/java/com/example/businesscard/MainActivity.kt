package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween)
                    {
                        Profile(fullName = "M Hardian Jusuf", title ="D121211041")
                        Contact(number = "+628-123-456-789", github ="github.com/hardianjusuf" , email = "hardianjusuf9@gmail.com")
                    }
                }
            }
        }
    }
}


@Composable
fun Contact(number: String, github: String, email: String, modifier: Modifier = Modifier){
    val image1 = painterResource(R.drawable.icon_telp)
    val image2 = painterResource(R.drawable.icon_github)
    val image3 = painterResource(R.drawable.icon_emaill)

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(top= 500.dp)
            .fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(bottom = 10.dp)

        ) {
            Spacer(modifier = Modifier.width(85.dp))
            Image(painter = image1,
                contentDescription = null,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
            )
            Spacer(modifier = Modifier.width(40.dp))
            Text(
                text = number,
                fontSize = 14.sp,
                lineHeight = 24.sp,
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(bottom = 10.dp)
        ) {
            Spacer(modifier = Modifier.width(85.dp))

            Image(painter = image2,
                contentDescription = null,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
            )
            Spacer(modifier = Modifier.width(40.dp))
            Text(
                text = github,
                fontSize = 14.sp,
                lineHeight = 25.sp,
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(bottom = 10.dp)
        ) {
            Spacer(modifier = Modifier.width(85.dp))
            Image(painter = image3,
                contentDescription = null,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
            )
            Spacer(modifier = Modifier.width(40.dp))
            Text(
                text = email,
                fontSize = 14.sp,
                lineHeight = 25.sp,
            )
        }
    }
}



@Composable
fun Profile(fullName: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.hardian_jusuf)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(bottom = 100.dp)
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(160.dp)
                .height(180.dp)
                .padding(bottom = 10.dp)
        )
        Text(
            text = fullName,
            fontSize = 34.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = title,
            fontSize = 24.sp
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        Profile(fullName = "M Hardian Jusuf", title ="D121211041")
        Contact(number = "+628-123-456-789", github ="github.com/hardianjusuf" , email = "hardianjusuf9@gmail.com")
    }
}


