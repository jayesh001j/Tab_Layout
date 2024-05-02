package com.example.tab_layout.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tab_layout.databinding.FragmentChatBinding
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class ChatFragment : Fragment() {

    private lateinit var binding: FragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCarousel()
    }

    private fun initCarousel() {
        val list = mutableListOf<CarouselItem>()

        list.add(
            CarouselItem(
                "https://www.tourism-of-india.com/pictures/travel_guide/attractions/thmb/dudh-sagar-30.jpeg",
                "Dudhsagar Falls, Goa/Karnataka border  Dudhsagar Falls is a majestic waterfall located on the Mandovi River, surrounded by lush greenery and accessible via trekking or train journey. "
            )
        )

        list.add(
            CarouselItem(
                "https://i.pinimg.com/736x/22/64/32/226432ad549996596dd6bbd7af3b82e7.jpg",
                "Athirappilly Falls, Kerala   Known as the Niagara of India, Athirappilly Falls is one of the largest waterfalls in Kerala, offering breathtaking views and opportunities for picnics."
            )
        )

        list.add(
            CarouselItem(
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1b/25/1d/f2/caption.jpg?w=400&h=400&s=1",
                "Vazhachal Falls, Kerala   Located near Athirappilly Falls, Vazhachal Falls is another beautiful waterfall surrounded by dense forests, perfect for a monsoon picnic."
            )
        )

        list.add(
            CarouselItem(
                "https://www.timetravelers.in/media/tour_images/gallery/Nanemachi__Adventure_geek.jpg",
                "Bhandardara, Maharashtra   Bhandardara is a hill station and picnic spot near Mumbai, famous for its serene lakes, waterfalls, and the Umbrella Falls, which come alive during the monsoon."
            )
        )
        list.add(
            CarouselItem(
                "https://preview.redd.it/rajmachi-fort-lonavala-pune-maharashtra-v0-beqk0yvfvhvb1.png?width=640&crop=smart&auto=webp&s=03824d04fcd2beb8a837f0687300ab3f6e2f889a",
                "Cherrapunji and Mawsynram, Meghalaya   These two places in Meghalaya are known as the wettest places on Earth, offering lush green landscapes, numerous waterfalls, and scenic spots for picnics."
            )
        )
        list.add(
            CarouselItem(
                "https://travel.roadstransporter.com/wp-content/uploads/2023/12/hill-station-in-india-3.jpg",
                "Nohsngithiang Falls (Seven Sisters Falls), Meghalaya   Located near Cherrapunji, the Seven Sisters Falls is a stunning cascade of seven streams surrounded by misty mountains and greenery."
            )
        )
        list.add(
            CarouselItem(
                "https://www.holidify.com/images/cmsuploads/compressed/w_20181204123235.png",
                "Munnar, Kerala Munnar is a popular hill station in Kerala known for its tea plantations, scenic valleys, and numerous waterfalls like Attukal Falls and Lakkam Waterfalls."
            )
        )
        list.add(
            CarouselItem(
                "https://qph.cf2.quoracdn.net/main-qimg-87f072119d1c47fc4184f75ac862ec80-lq",
                "Kempty Falls, Uttarakhand  Kempty Falls near Mussoorie is a famous picnic spot with cascading waterfalls surrounded by hills and lush forests."
            )
        )
        list.add(
            CarouselItem(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUnkivsimumu9P43JYKlE4lu4wKyJsc8BnbTmX9SAdD6VvV4jaP5KrWCgG2LXRJKLmbEY&usqp=CAU",
                "Palaruvi Falls, Kerala   Palaruvi Falls in Kerala is one of the most beautiful and lesser-known waterfalls, surrounded by dense forests and offering a serene picnic spot."
            )
        )
        list.add(
            CarouselItem(
                "https://www.historywithtravel.com/images/pune-waterfall/walen-waterfall.jpeg",
                "Tirathgarh Falls, Chhattisgarh  Tirathgarh Falls is a picturesque waterfall located amidst the lush greenery of the Kanger Valley National Park, perfect for a monsoon picnic."
            )
        )

        binding.imageCarousel.setData(list)
    }
}
