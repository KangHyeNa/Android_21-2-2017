package com.example.enter.lichmau2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer page=0;
    Integer thang=1;
    Integer ngay=1;
    Integer thu=0;
    Integer nam=2017;
    Integer ngayamlich=4;
    Integer thangamlich=12;
    Integer i=-1;
    Integer so1 ;
    Integer so2 ;
    String s0="CHỦ NHẬT";
    String s1="THỨ HAI";
    String s2="THỨ BA";
    String s3="THỨ TƯ";
    String s4="THỨ NĂM";
    String s5="THỨ SÁU";
    String s6="THỨ BẢY";
    String sthu="";
    Integer bienthu;
    String arrcaunoi[] = {"Cuộc sống vốn không công bằng - Hãy tập quen dần với điều đó.","Không ai quan tâm đến lòng tự trọng của bạn đâu. Mọi người chỉ trông đợi bạn đạt được điều gì đó trước khi bạn cảm thấy hài lòng về bản thân.","Bạn sẽ không thể kiếm được 40.000 USD/năm ngay sau khi tốt nghiệp trung học. Bạn cũng không là một ông sếp lớn có điện thoại gắn trên ô tô cho đến khi bạn kiếm được hai thứ đó.", "Nếu bạn nghĩ rằng giáo viên của mình thật hắc ám thì hãy đợi đến khi bạn làm việc dưới trướng một ông chủ. Rồi bạn sẽ thấy với ông ta thì không có khái niệm nhiệm kỳ nắm quyền.","Nếu như bạn làm rối tung mọi chuyện lên thì đó không phải lỗi của bố mẹ bạn, thế nên đừng có mà ta thán về lỗi lầm của bạn, hãy rút kinh nghiệm từ chúng.","Trước khi bạn ra đời, bố mẹ của bạn đã chẳng 'đáng chán'như bây giờ. Bố mẹ đã trả những hoá đơn của bạn, giặt giũ quần áo bạn sạch sẽ và lắng nghe bạn kể xem bạn sành điệu như thế nào. Vì vậy trước khi cằn nhằn bố mẹ điều gì thì hãy dọn dẹp buồng ngủ của bạn cho ngăn nắp đi đã.","Ở trường học có thể không có người thắng kẻ thua nhưng ở trường đời thì không phải vậy. Ở một số trường học người ta còn hủy bỏ những điểm rớt và cho bạn cơ hội để bạn giành điểm cao. Trong cuộc sống thực không bao giờ có chuyện như thế đâu.","Cuộc sống không được chia thành những học kỳ. Bạn cũng chẳng có mùa hè để nghỉ ngơi và rất ít ông chủ nào quan tâm và giúp bạn tìm ra cơ hội này. Hãy tự làm điều mình muốn trong thời gian nhàn rỗi của bạn.","Truyền hình không phải là cuộc sống thực. Trong cuộc sống, người ta phải biết rời khỏi quán cà phê giải trí để đi làm việc.","Hãy hòa nhã với những kẻ dở hơi. Ai biết được ngày sau và khi đó bạn có thể phải làm việc cho một kẻ như vậy.","Sống cuộc đời của mình theo mong muốn của người khác là lãng phí cuộc đời của bạn.","Tôi thích đi dưới mưa để không ai thấy tôi đang khóc.","Đầu tiên họ phớt lờ bạn, sau đó họ cười bạn, kế tiếp họ cực khổ đấu với bạn và cuối cùng bạn thắng.","Mọi thứ bạn muốn đều có thể là của bạn: Kiểu công việc bạn muốn, mối quan hệ bạn cần, những điều làm bạn hạnh phúc. Nhưng trước tiên bạn phải biết bản thân mình muốn điều gì? ","Nếu cơ hội không gõ cửa nhà bạn, có nghĩa là nhà bạn chưa có cửa, hãy gắn 1 cái. ","Đừng nói mình không có đủ thời gian để làm nên những điều vĩ đại. Bạn có đúng 24 giờ một ngày cũng như Hell Keller, Leonadro Da Vinci, và Walt Disney.","Không phải khó khăn làm bạn trở nên chùn bước, mà là bạn chùn bước nên nó mới khó khăn.","Những con người vĩ đại họ thảo luận về tư tưởng, con người bình thường nói về các sự kiện, những người tầm thường thì nói về người khác.","Tất cả ước mơ của chúng ta có thể thành sự thật nếu chúng ta có đủ can đảm để theo đuổi nó đến cùng. ","Cái gì đầu óc có thể nghỉ đến, thì nó có thể hiện thực hóa nó. ","Không bao giờ là quá trể để trở thành con người mà bạn mong muốn. ","Có hai cách để sống cuộc đời của bạn. Thứ nhất, sống như trên đời này không có điều kì diệu nào. Hoặc bạn có thể sống như những điều xảy ra với bạn điều mang đến phép màu.","Đã từng thử. Đã từng thất bại. Không sao cả. Hãy thử lại. Lại thất bại. Thất bại tốt hơn.","Nước mắt của thế gian này luôn bất biến. Với mỗi người bắt đầu khóc, ở nơi nào đó khác một người ngừng rơi lệ. Với tiếng cười cũng vậy.","Mỗi ngôn từ đều giống như vết ố không cần thiết lên sự im lặng và hư vô.","Sinh ra ai cũng điên rồ. Một vài người vẫn giữ nguyên như thế.","Nhà thơ là giác quan, triết gia và trí tuệ của nhân loại.","Không gì buồn cười hơn là bất hạnh, tôi đảm bảo với bạn như vậy. Phải, phải, nó là thứ khôi hài nhất trên thế gian này.","Di sản tốt nhất mà cha mẹ có thể dành cho con cái là chút ít thời gian mỗi ngày.","Nhầm lẫn chỉ trở thành sai lầm khi bạn từ chối sửa chữa nó.","Sự chủ động đối với thành công giống như que diêm đang cháy đối với ngọn nến.","Một trong những lạc thú bền vững nhất mà bạn có thể trải nghiệm là cảm xúc nảy sinh khi bạn thực tâm tha thứ cho kẻ thù – dù người đó có biết hay không.","Sự kiên nhẫn chẳng bao giờ quan trọng hơn khi bạn đang ở bên bờ đánh mất nó.","Tri thức là chiếc tẩy tốt nhất trên thế giới đối với sự không hòa hợp, sự hoài nghi, nỗi tuyệt vọng và vô số khiếm khuyết tự nhiên của con người.","Khéo xử là khả năng khiến người ta nhìn thấy sét mà không bị sét đánh.","Lời khen có thể là tài sản quý giá nhất của bạn miễn là bạn không nhắm nó vào bản thân mình.","Cục tẩy tốt nhất trên thế giới là giấc ngủ ngon.","Bạn chẳng bao giờ nhận rõ mình cảm thấy thế nào về hàng xóm cho tới khi tấm biển ‘Rao bán’ đột nhiên xuất hiện trước nhà anh ta.","Chó là một trong những lý do còn lại giải thích vì sao ta có thể thuyết phục một số người ra ngoài đi dạo.","Tình yêu thực sự không phải là cùng nắm tay trong tay, mà là cùng tâm ý tương thông.","Sự cám dỗ, không giống như thời cơ, luôn cho bạn nhiều cơ hội thứ hai.","Một trong những điều khó khăn nhất để dạy con trẻ là sự thật quan trọng hơn hậu quả.","Một điều tốt đẹp về tính đúng giờ: đó là cách chắc chắn giúp bạn có được vài phút riêng tư.","Có ba loại người trong ngành – vài người làm nên chuyện, nhiều người quan sát chuyện được làm nên, và số đông vượt trội chẳng có khái niệm chuyện gì đã xảy ra.","Người ta có thể học được nhiều từ câu cá – khi cá cắn câu, ta quên hết mọi rắc rối trên thế giới, dù lớn thế nào đi nữa.","Người bảo anh ta sẽ gặp bạn ở giữa đường thường nghĩ mình đang đứng trên chính điểm giữa ấy.","Lòng can đảm quan trọng nhất. Tất cả đều trôi chảy nếu ta có lòng can đảm.","Nếu bạn có nó [tình yêu thương], bạn không cần gì khác, và nếu bạn không có nó, bạn có gì khác cũng đều không quan trọng.","Khi đứa bé phá lên cười lần đầu tiên, tiếng cười ấy vỡ tan thành ngàn mảnh, và chúng bắn đi khắp nơi, và đó là điểm bắt đầu của các nàng tiên.","Cái chết sẽ là một cuộc phiêu lưu cực kỳ lớn.","Đừng bao giờ nói tạm biệt vì tạm biệt nghĩa là đi xa và đi xa nghĩa là lãng quên.","Tôi là tuổi trẻ, tôi là niềm vui, tôi là con chim nhỏ vừa thoát ra khỏi trứng.","Người mang nắng trời vào cuộc sống của người khác không thể ngăn nó chiếu sáng tới chính cuộc sống của mình.","Giấc mơ có thể trở thành sự thật, nếu chúng ta chịu ước mơ đủ mãnh liệt, Bạn có thể đạt được bất kỳ điều gì trong đời nếu bạn sẵn lòng hy sinh mọi thứ khác cho nó.","Sự tức giận là thứ vũ khí mà chúng ta cầm đằng lưỡi.","Nơi tốt nhất mà một người có thể chết đi là nơi anh ta chết đi vì người khác.","Những kẻ vô dụng nhất là những kẻ chẳng bao giờ thay đổi qua năm tháng.","Chúng ta có nên lập ra một điều luật mới từ tối nay không: luôn luôn cố gắng tử tế hơn cần thiết một chút?","Lý do chim có thể bay và ta thì không chỉ đơn giản là chúng có niềm tin tuyệt đối, vì có niềm tin nghĩa là có cánh.","Trên những bờ biển phép màu ấy, trẻ con chơi đùa, vĩnh viễn kéo lên bờ những con thuyền gai của mình. Chúng ta cũng đã từng ở đó; chúng ta vẫn có thể nghe thấy tiếng sóng vỗ, dù chúng ta không còn cập bờ nữa.","Đừng để ai yêu thương sẽ không hạnh phúc, thậm chí ngay cả tình yêu không được đáp trả cũng có ánh cầu vồng của mình.","Tham vọng – đó là sự yếu đuối cuối cùng của những tâm hồn cao thượng.","Cuộc đời là bài học dài về tính tự khiêm.","Mỗi người đàn ông thành đạt đều thích nghĩ anh ta đã tự gây dựng tất cả cho mình, và người vợ mỉm cười không lên tiếng.","Khoảng khắc bạn nghi ngờ mình có thể bay, bạn mãi mãi không còn có thể bay nữa.","Bạn hẳn đã từng được khuyên rằng không nên để thời gian vàng bạc trôi qua; nhưng một số khoảng khắc là vàng son chính bởi vì ta để chúng trôi qua.","Chúng ta chẳng bao giờ hiểu được mình cần ít thế nào trên thế giới này cho tới khi ta đánh mất nó.","Bí mật của hạnh phúc không phải là làm điều bạn thích, mà là thích điều bạn làm.","Tôi không đủ trẻ trung để biết mọi thứ.","Một người phụ nữ có thể là bất cứ điều gì mà người đàn ông yêu nàng mong muốn.","Chúa cho chúng ta trí nhớ để ta có thể có hoa hồng vào tháng Mười hai.","Giấc mơ có thể thành hiện thực, chỉ nếu như bạn thực sự mong muốn. Bạn có thể có bất cứ thứ gì trong cuộc sống nếu bạn dám hy sinh tất cả mọi thứ cho nó.","Báo chí in ấn hoặc là phúc lành lớn nhất hoặc là lời nguyền rủa lớn nhất của thời hiện đại, người ta đôi khi quên mất nó là bên nào.","Bạn có cần lý do để yêu không?","Thà không chung thủy còn hơn chung thủy mà không muốn thế.","Thật buồn khi già đi, nhưng thật tốt khi trở nên chín chắn.","Còn gì đẹp hơn một người phụ nữ già nua trở nên thông thái cùng tuổi tác? Mỗi tuổi đều có thể khiến ta say mê, miễn là ta sống trong nó.","Một người chồng tốt không bao giờ đi ngủ trước vào buổi đêm và dậy sau vào buổi sáng.","Một cuộc hôn nhân tốt là giữa bà vợ mù và ông chồng điếc.","Trái tim của người mẹ là vực sâu muôn trượng mà ở dưới đáy, bạn sẽ luôn tìm thấy sự tha thứ.","Không ai yêu một người phụ nữ vì nàng đẹp hay nàng xấu, ngu ngốc hay thông minh. Chúng ta yêu vì chúng ta yêu.","Độ lâu bền của sự đan mê tỉ lệ thuận với sự kháng cự ban đầu của người phụ nữ.","Không có tài năng vĩ đại nào thiếu đi được ý chí mạnh mẽ.","Người mẹ thật sự chẳng bao giờ rảnh rỗi.","Anh thấy đấy, cuộc đời của một người mẹ là chuỗi kịch tính dài liên tiếp, lúc dịu dàng và êm ái, lúc kinh hoàng. Không ngắn ngủi một giờ nhưng đầy cả niềm vui và sợ hãi.","Phương châm của sự hào hoa cũng là phương châm của trí tuệ; phụng sự tất cả nhưng yêu chỉ một.","Hạnh phúc của người mẹ giống như đèn hiệu, soi sáng tương lai nhưng cũng phản chiếu lên quá khứ trong vỏ ngoài của những ký ức yêu thương.","Vào tuổi mười lăm, sắc đẹp và tài năng chưa tồn tại; chỉ có sự hứa hẹn về người phụ nữ sắp hình thành.","Tình yêu là trò chơi mà ai cũng gian lận.","Sự cô độc cũng tốt, nhưng bạn cần ai đó nói với bạn rằng sự cô độc cũng tốt.","Có điều gì đó thật lớn lao và khủng khiếp trong tự sát.","Sự tự do về chính trị, sự hòa bình của một quốc gia và chính cả khoa học là những món quà mà Định mệnh đánh thuế nặng nề bằng máu!","Sự khiêm tốn là lương tri của cơ thể.","Không người đàn ông nào nên lấy vợ cho tới khi đã học giải phẫu và mổ xẻ ít nhất là một người phụ nữ.","Sự nhã nhặn chỉ là lớp vỏ ngoài mỏng manh của tính ích kỷ chung.","Tài chính, cũng như thời gian, nuối chửng con của chính mình.","Năng khiếu không được thỏa nguyện rút cạn màu sắc khỏi toàn bộ cuộc sống của con người.","Tình yêu đầu giống như loại vắc xin cứu người ta khỏi nhận được sự than phiền lần thứ hai.","Tất cả tính nhân văn là sự đam mê; không có đam mê, tôn giáo, lịch sử, tiểu thuyết, nghệ thuật đều là vô ích.","Tình yêu có bản năng của riêng mình, tìm đường tới trái tim, cũng như loài côn trùng yếu ớt nhất tìm đường tới đóa hoa, với ý chí không gì có thể làm mất tinh thần hay trệch hướng.","Lặn xuống đáy lạc thú, chúng ta mang lên nhiều sỏi hơn là ngọc trai.","Trẻ con, những đứa trẻ đáng yêu, có thể an ủi người phụ nữ về sắc đẹp đã tàn phai.","Anh càng phán xét nhiều thì anh càng yêu ít.","Chỉ trong sự nuôi dưỡng, người phụ nữ mới nhận ra bổn phận làm mẹ của mình một cách rõ ràng và hiện hữu; nó là niềm vui trong mọi khoảng khắc.","Luật pháp là mạng nhện mà ruồi lớn thì bay qua còn ruồi con thì mắc kẹt.","Có lẽ đức hạnh không là gì hơn ngoài sự nhã nhặn của tâm hồn.","Khi luật pháp trở nên bạo ngược, đạo đức bị buông thả, và ngược lại.","Thiên nhiên chỉ tạo ra động vật ngu xuẩn. Xã hội mới tạo ra con người ngu xuẩn.","Nhiều người đàn ông cảm động khôn xiết trước điều nhỏ nhất giống với sự đau khổ của người phụ nữ; họ coi vẻ đau khổ như là dấu hiệu của sự chung thủy hay là tình yêu.","Chịu đựng niềm vui cực độ khó hơn bất cứ nỗi đau khổ nào.","Sức mạnh không được thể hiện bởi đánh mạnh hay đánh nhiều, mà là đánh trúng.","Ai chi tiêu quá nhanh không bao giờ giàu có được.","Hôn nhân luôn phải đấu tranh với con quái vật nuốt lấy mọi thứ: sự hiểu rõ lẫn nhau.","Đằng sau mọi cơ đồ lớn ẩn chứa tội ác lớn.","Ngồi dậy và để ý thì dễ lắm, điều khó là đứng dậy và hành động.","Tình yêu chân thực vĩnh cửu, vô biên và luôn luôn là chính nó. Nó bình đẳng, trong sáng, không có những thể hiện hung bạo: người ta thấy nó với tóc bạc và luôn luôn giữ một trái tim trẻ trung.","Tình yêu là bài thơ của giác quan.","Người phụ nữ biết gương mặt của người đàn ông nàng yêu như thủy thủ hiểu biển khơi rộng lớn.","Nói người đàn ông không thể luôn luôn yêu một người phụ nữ cũng vô lý như nói người nhạc sĩ viôlông cần vài chiếc đàn để chơi cùng một bản nhạc.","Xã hội đầy dẫy những điều bí ẩn có vẻ khó mà giải quyết được. Nó là mê cung hoàn hảo của những mưu đồ.","Học hỏi khoác lên sự hấp dẫn cho thế giới xung quanh ta.","Có lẽ sự bình đẳng là quyền của con người, nhưng không thế lực nào trên trái đất này từng có thể biến nó thành sự thật.","Giá như chúng ta có thể dùng đôi tay mình để vẽ lên những gì mắt mình nhìn thấy.","Con người nên tin vào hôn nhân như tin vào sự bất tử của linh hồn.","Vì lòng nhiệt huyết, nếu được đi theo, mang cùng nó sự sáng suốt; nó có thể đem tới một kiểu thông minh cho những kẻ ngốc, người khờ khạo hay ngu xuẩn, đặc biệt là trong tuổi trẻ.","Cái chết hợp nhất cũng như là chia li; nó khiến mọi cảm xúc nhỏ mọn đều phải lặng im.","Cơ hội, đó là vị thần tối cao đang sinh nở.","Bộ máy hành chính là cơ cấu khổng lồ được những người lùn điều khiển.","Chơi loại nhạc cụ nào cũng dễ dàng: tất cả những gì bạn phải làm là chạm vào đúng dây đúng phím vào đúng lúc và rồi nhạc cụ sẽ tự chơi.","Tôi buộc phải cần cù. Ai cần cù như tôi rồi cũng sẽ thành công như tôi.","Nếu tôi định làm thằng ngu thì tôi sẽ làm thằng ngu vì chính tôi tự nguyện.","Tình bạn luôn luôn là dầu xoa dịu tốt nhất cho nỗi đau vì thất vọng trong tình yêu.","Kinh doanh, bạn biết đấy, có thể mang cho bạn tiền bạc, nhưng tình bạn thì hiếm khi nào.","Sự ích kỷ luôn cần được tha thứ, bởi không có hy vọng về thuốc chữa.","Hạnh phúc trong hôn nhân hoàn toàn là vấn đề may rủi.","Không gì giả dối hơn tỏ vẻ nhún nhường. Thường thì nó chỉ là sự cẩu thả trong quan điểm, và đôi khi là khoe khoang gián tiếp.","Làm điều đúng không bao giờ là sớm quá.","Sự tưởng tượng của phụ nữ diễn ra rất nhanh chóng; nó nhảy từ thán phục sang tình yêu, rồi từ tình yêu sang hôn nhân chỉ trong khoảng khắc.","Kiêu căng và kiêu hãnh là hai chuyện khác nhau, dù những từ này thường được sử dụng như đồng nghĩa. Một người có thể tự hào về bản thân mà không tự cao tự đại. Kiêu hãnh thể hiện nhiều hơn cách nhìn của chúng ta về bản thân; kiêu căng, cách chúng ta muốn người khác nghĩ về mình.","Thu nhập cao là công thức tốt nhất cho hạnh phúc mà tôi từng biết.","Chắc chắn trên thế gian này không có đủ đàn ông giàu có cho phụ nữ đẹp sánh đôi.","Tôi càng hiểu biết thế giới, tôi càng tin là tôi sẽ không bao giờ gặp người đàn ông mình có thể thật sự yêu thương.","Có những người mà bạn càng làm nhiều điều cho họ, họ càng làm ít cho chính mình.","Ngồi dưới bóng râm trong một ngày đẹp trời và ngắm nhìn cây cỏ xanh tươi là sự nghỉ ngơi hoàn hảo nhất.","Một nửa thế giới không thể hiểu hạnh phúc của người khác.","Chúng ta đều có thể tìm được người dẫn đường tốt hơn bất cứ ai trong bản thân mình, nếu chúng ta chịu nghe theo nó.","Không gì quyến rũ bằng sự dịu dàng của trái tim.","Thật đáng tiếc cho những người không được sớm nếm trải thiên nhiên trong cuộc đời.","Đàn ông luôn luôn không thể hiểu nổi tại sao phụ nữ lại có thể từ chối lời cầu hôn.","Phong cách của một người không thể chi phối phong cách của người khác.","Cách thức của một người có thể cũng tốt như người khác, nhưng tất cả chúng ta đều thích cách của chính mình nhất.","Tình bạn là một tâm hồn ngự trong hai thể xác.","Chúng ta là những gì mà chúng ta thường xuyên làm. Vì vậy sự hoàn hảo là thói quen chứ không phải hành động.","Vẻ đẹp hiện nguyên hình thì thuyết phục hơn bất cứ thư từ giới thiệu nào.","Hạnh phúc đúng là món quà của thượng đế.","Tại sao những kẻ đố kỵ bao giờ cũng có một cái gì để buồn phiền?","Bởi vì hắn bị dày vò không chỉ vì những thất bại của bản thân hắn mà cả vì những thành công của người khác.","Người vượt qua được nỗi sợ của mình sẽ thực sự có tự do.","Nếu chuyện không diễn ra như ta ước, ta nên ước chúng như chúng diễn ra.","Người làm bạn với tất cả mọi người không phải là bạn của ai cả.","Tất cả hành động của con người bắt nguồn từ một hoặc nhiều lý do trong những lý do sau: tình cờ, bản tính, bắt ép, thói quen, lý trí, đam mê, và dục vọng.","Ai cũng có thể tức giận – điều đó dễ lắm, nhưng nổi giận với đúng người ở đúng mức vào đúng thời điểm vì đúng mục đích, và theo cách đúng – không hề dễ và không phải ai cũng làm được.","Học hỏi là vật trang hoàng trong cảnh giàu sang, là nơi trú ẩn trong nghịch cảnh, và là nguồn dự trữ lúc tuổi già.","Hiểu bản thân là điểm bắt đầu của mọi sự uyên thâm.","Hình thức bất công tồi tệ nhất chính là cố gắng khiến những thứ không đồng đều trở thành bình đẳng.Người sáng suốt lên tiếng khi họ có điều cần nói, kẻ khờ lên tiếng bởi vì họ phải nói gì đó.","Có một sự khác biệt nhỏ giữa người và người, nhưng khác biệt nhỏ ấy tạo ra khác biệt lớn. Khác biệt nhỏ là thái độ. Khác biệt lớn là việc nó tích cực hay tiêu cực.","Một dấu hiệu đặc trưng riêng của tri thức sâu sắc là quyền năng của sự truyền dạy.","Tất cả những cảm xúc thân thiện hướng tới người khác đều đến từ những cảm xúc thân thiện tự hướng tới bản thân mình.","Ngày hôm nay, hãy thử xem nếu bạn có thể mở rộng trái tim và trải dài tình yêu thương để nó không chỉ chạm tới những người bạn có thể dễ dàng trao nó, mà còn cả những người cần đến nó.","Sự chịu đựng và sự thờ ơ là những đức hạnh cuối cùng của một xã hội đang giãy chết.","Thiên hướng của bạn nằm ở nơi tài năng gặp gỡ với những đòi hỏi của thế giới.","Ở mặt tốt nhất, con người cao thượng nhất trong tất cả các loài động vật; tách khỏi luật lệ và công lý, anh ta trở thành tồi tệ nhất.","Bằng chứng cho thấy bạn biết gì đó là bạn có thể truyền dạy nó.","Hạnh phúc phụ thuộc vào bản thân ta.","Hy vọng là giấc mơ khi đang thức.","Không trí tuệ nào từng tồn tại mà không vướng chút điên rồ.","Người bạn tốt nhất là người bạn chúc tôi những điều tốt lành vì thực tâm mong muốn điều tốt đẹp đến với tôi.","Bạn sẽ không bao giờ làm được gì trên thế gian này mà không có lòng can đảm. Đó là phẩm chất tốt nhất của trí tuệ sau danh dự.","Khi con người muốn làm cái máy có thể đi, anh ta tạo ra bánh xe, chẳng có gì giống như một cái chân. Và như vậy, anh ta đã theo chủ nghĩa siêu thực mà không biết điều đó.","Niềm vui luôn luôn đi sau đau khổ.","Đôi lúc cũng cần thiết dừng chân trong cuộc hành trình theo đuổi hạnh phúc, và chỉ đơn giản là cảm thấy hạnh phúc.","Ký ức là những chiếc sừng đi săn mà âm thanh vang lên biến mất vào trong gió.","Không có thi nhân, không có nghệ sĩ, con người sẽ sớm chán ngấy sự đơn điệu của tự nhiên.","Tôi yêu con người, không phải vì thứ đoàn kết họ mà vì thứ chia rẽ họ, và điều tôi muốn biết nhất là thứ gặm nhấm trái tim họ.","Tôi ghét những nghệ sĩ không đi cùng thời đại của mình.","Không ai có thể hiểu những đau khổ của tôi, hay nỗi kinh hoàng dâng lên trong lồng ngực, nếu người đó không hiểu trái tim của một người mẹ.","Chẳng có gì mới trừ thứ đã bị lãng quên.","Không ai xứng đáng với những giọt nước mắt của bạn, nhưng nếu có người xứng đáng, anh ta sẽ không làm bạn khóc","Con người không chết khi nên chết mà khi có thể chết","Hãy luôn nhớ rằng điều quan trọng nhất trong một cuộc hôn nhân tốt đẹp không phải là hạnh phúc mà là sự ổn định","Không phải người ta ngừng theo đuổi giấc mơ vì mình già đi, người ta già đi vì ngừng theo đuổi giấc mơ","Nếu Chúa không nghỉ vào Chủ Nhật, Người đã có đủ thời gian để hoàn thiện thế giới rồi","Trí nhớ của trái tim xóa đi những điều xấu và phóng đại những điều tốt đẹp","Cuối cùng văn chương cũng chính là nghề mộc. Anh đều làm việc với hiện thực, một vật liệu cũng cứng như gỗ","Không, không giàu có. Tôi là người nghèo có tiền, hoàn toàn không giống nhau","Vấn đề của hôn nhân là nó kết thúc vào mỗi đêm sau khi làm tình, và phải xây dựng lại nó mỗi buổi sớm trước khi ăn sáng","Văn chương hư cấu được phát minh vào ngày Jonas về nhà và nói với vợ mình muộn ba ngày vì bị cá voi nuốt","Những điều có ý nghĩa trong cuộc sống không phải là điều gì xảy đến với bạn mà là bạn nhớ gì và bạn nhớ nó như thế nào","Người ta biết tuổi già đến đi khi bắt đầu trông giống như bố mình","Hãy hưởng thụ cuộc đời. Nó không phải là buổi diễn tập.","Nước mắt là những ngôn từ trái tim, không thể diễn tả","Có một thứ không tuân theo nguyên tắc số đông, đó là lương tâm con người.","Thông thường, người ta nhìn thấy cái họ tìm kiếm, nghe thấy cái họ lắng nghe","Con không bao giờ thực sự hiểu được một người nếu không xem xét mọi việc từ quan điểm của người đó, tức là sống và cư xử y như anh ta.","Nghệ thuật đọc là lướt qua một cách khôn ngoan.","Có sự nhiệt huyết rõ ràng đối với tự do, khiến bản tính con người vượt lên trên chính nó, trong những hành động can đảm và anh hùng.","Khi thanh kiếm đã được rút ra, cơn cuồng nộ của con người không có giới hạn kiềm chế.","Trao tất cả quyền lực cho số đông, họ sẽ đàn áp số ít. Trao tất cả quyền lực cho số ít, họ sẽ đàn áp số đông.","Tôi cho rằng nghĩa vụ đầu tiên của xã hội là công lý.","Tôi không bao giờ chờ đợi thấy được công việc hoàn hảo từ người không hoàn hảo.","Người không đứng lên vì điều gì không sụp đổ vì điều gì.","Lời nói dữ dội hiếm khi hữu dụng. Sự kiên quyết thực sự tốt cho mọi thứ. Vẻ khệnh khạng chẳng tốt cho điều gì cả.","Thứ quyền lực chi phối sinh kế của một người là thứ quyền lực chi phối ý chí của anh ta.","Chỉ có hai điều là vô hạn: vũ trụ và sự ngu xuẩn của con người, và tôi không chắc lắm về điều đầu tiên.","Sự khác biệt giữa quá khứ, hiện tại và tương lai chỉ là một ảo tưởng dai dẳng đến ngoan cố.","Không phải là tôi quá thông minh, chỉ là tôi chịu bỏ nhiều thời gian hơn với rắc rối.","Học từ ngày hôm qua, sống ngày hôm nay, hi vọng cho ngày mai. Điều quan trọng nhất là không ngừng đặt câu hỏi.","Sự đơn điệu và cô độc của một cuộc sống yên lặng kích thích trí sáng tạo.","Có một câu hỏi đôi khi khiến tôi thấy mơ hồ: Tôi điên hay người khác điên?","Đừng phấn đấu để thành công mà hãy phấn đấu để mình có ích.","Kẻ ngu xuẩn nào cũng có thể khiến mọi thứ trở nên to hơn, phức tạp hơn và bạo lực hơn. Chỉ bàn tay của thiên tài – và thật nhiều dũng khí – để biến chuyển ngược lại.","Người đọc quá nhiều và dùng tới bộ óc quá ít sẽ rơi vào thói quen suy nghĩ lười biếng.","Logic sẽ đưa anh từ điểm A tới điểm B. Trí tưởng tượng sẽ đưa anh tới mọi nơi.","Sự khác biệt giữa thiên tài và kẻ ngu dốt là ở chỗ thiên tài luôn có giới hạn.","Tôi không biết chiến tranh thế giới thứ 3 sẽ sử dụng vũ khí nào nhưng tôi biết rằng chiến tranh thế giới thứ 4 sẽ sử dụng gậy gộc và đá!","Tôi nghĩ và nghĩ hàng năm hàng tháng. Chín mươi chín lần tôi đi tới kết luận sai lầm. Lần thứ một trăm tôi đúng.","Tôi sống với sự cô đơn đau đớn trong tuổi trẻ nhưng lại ngọt ngào trong những năm tháng trưởng thành.","Nếu anh không thể giải thích đơn giản thì anh chưa hiểu đủ rõ.","Trước Chúa chúng ta đều thông thái và ngu xuẩn như nhau.","Tôi là người vô đạo tới sâu sắc – điều này có phần như là một thứ tôn giáo mới.","Anh càng đi nhanh, anh càng đi được ít.","Quyền lực luôn luôn thu hút những kẻ không có đạo đức.","Kẻ nào chưa từng mắc phải lỗi lầm cũng là kẻ chưa bao giờ thử làm việc gì cả.","Trí tưởng tượng quan trọng hơn kiến thức.","Không thể gìn giữ hòa bình bằng bạo lực. Nó chỉ có thể đạt được bằng sự thông hiểu lẫn nhau.","Lực hấp dẫn không chịu trách nhiệm cho việc con người ta yêu nhau.","Đừng làm gì trái với lương tâm, ngay cả khi chính quyền yêu cầu bạn.","Sợ chết là nỗi sợ hãi phi lý nhất, vì người đã chết chẳng có nguy cơ bị tai nạn.","Chính trị chỉ cho hiện tại, nhưng phương trình là mãi mãi.","Tôi không bao giờ tin vào vị Chúa chơi xúc xắc với thế gian này.","Tôi không có tài năng đặc biệt nào, tôi chỉ có sự tò mò đầy nhiệt huyết.","Môi trường là tất cả những gì không phải là tôi.","Nhiệm vụ của chúng ta là tự giải phóng bản thân bằng cách làm rộng vòng tròn của lòng trắc ẩn để ôm lấy mọi sinh vật sống và tất cả sắc đẹp của thiên nhiên.","Nếu thực tế không vừa với học thuyết, hãy thay đổi thực tế.","Khoa học mà thiếu tôn giáo thì khập khiễng. Tôn giáo mà không có khoa học thì mù quáng.","Thông tin không phải là kiến thức.","Đừng lo lắng về khó khăn của bạn trong toán học, tôi đảm bảo với bạn rằng những khó khăn toán học của tôi còn gấp bội.","Tôi không những chỉ là một người chuộc hòa bình mà còn là một người chuộc hòa bình máu chiến. Tôi sẵn sàng chiến đấu vì hòa bình. Không gì có thể kết thúc chiến tranh nếu bản thân con người không từ chối tham gia chiến tranh.","Tất cả những điều có giá trị trong xã hội con người đều dựa vào cơ hội phát triển hòa hợp trong mỗi cá nhân.","Chúa trời rất khó hiểu, nhưng không ma mãnh.","Chính là trải nghiệm về những điều bí ẩn – thậm chí ngay cả khi lẫn trong niềm kính sợ – đã sản sinh ra tôn giáo.","Nỗ lực kết hợp giữa trí tuệ và quyền lực hiếm khi thành công, mà có thành công cũng chỉ trong chốc lát.","Để thật sự cười, anh phải có thể lấy nỗi đau của mình ra và chơi với nó!","Giúp bạn bè khi họ cần thật dễ dàng, nhưng dành cho họ thời gian không phải lúc nào cũng thuận lợi.","Đây là một thế giới tàn nhẫn, và người ta phải tàn nhẫn để đối phó với nó.","Bản chất thực sự của một người đàn ông xuất hiện khi anh ta say xỉn.","Một ngày không có tiếng cười là một ngày lãng phí.","Chúng ta ai cũng muốn giúp người khác. Con người là thế. Chúng ta muốn sống bên hạnh phúc của nhau chứ không phải sự khổ sở của nhau.","Tuyệt vọng là ma túy. Nó ru ngủ trí óc vào sự dửng dưng.","Cuộc đời là bi kịch khi quay gần, nhưng là hài kịch khi quay xa.","Con người là thiên tài khi đứng một mình. Nhưng đám đông con người thì tạo ra con quái vật không đầu, một thằng ngu lớn lao, tàn bạo đi bất cứ nơi nào bị thúc.","Tôi nghĩ một trong những điều trớ trêu của cuộc đời là gây ra sai lầm vào đúng lúc.","Không có gì là vĩnh viễn trên thế giới độc ác này – thậm chí cả những rắc rối của chúng ta.","Anh muốn ý nghĩa làm gì chứ? Cuộc đời là khát khao, không phải một ý nghĩa.","Tôi không có nhiều kiên nhẫn với vật đẹp đẽ cần phải giải thích mới hiểu được. Nếu nó cần thêm diễn giải từ ai khác ngoài người tạo ra nó, thì tôi tự hỏi liệu nó đã làm trọn mục đích của nó chưa?","Sự căm thù của con người sẽ trôi qua, và những kẻ độc tài rồi sẽ chết, và sức mạnh chúng cướp của nhân dân sẽ trở về với nhân dân. Và chừng nào con người còn chết đi, tự do sẽ không bao giờ tàn lụi.","Tại sao thi ca lại phải khiến người ta hiểu được?","Ngôn từ rất rẻ. Thứ to nhất bạn có thể nói là ‘con voi’.","Tôi không tin công chúng biết mình muốn gì; đó là kết luận tôi thu được từ sự nghiệp của mình.","Kẻ độc tài giải phóng chính mình, nhưng lại nô dịch hóa nhân dân.","Điều đáng buồn nhất tôi tưởng tượng ra được là quen với sự xa hoa.","Nếu bạn không thể nâng gánh nặng lên khỏi lưng người khác, đừng rời khỏi. Hãy cố gắng làm nhẹ nó.","Làm điều bạn thích là tự do. Thích điều bạn làm là hạnh phúc.","Để thành công, bạn phải sẵn lòng thất bại.","Nấc thang thành công không quan tâm ai đang trèo nó.","Tương lai của bạn phụ thuộc vào rất nhiều điều, nhưng chủ yếu là vào bạn.","Tin tưởng vào bản thân sẽ khiến sự tuyệt vọng biến mất.","Bạn không thể vừa ghen tị và vừa hạnh phúc.","Trên con đường cao tốc của cuộc đời, chúng ta thường nhận ra hạnh phúc từ gương chiếu hậu.","Nếu một người cho bạn thời gian của mình, anh ta không thể cho bạn món quà nào quý giá hơn nữa.","Nếu bạn muốn có hạnh phúc, hãy trao nó cho người khác.","Để thắng cuôc, bạn cần cả kỹ năng và ý chí.","Sự khiêm tốn là chiến thắng của tâm trí đối với những lời xu nịnh.","Một trong những tài năng lớn lao nhất là tài nhận ra và phát triển tài năng ở người khác.","Tính hài hước lấp đầy những ổ gà trên đường đời.","Hãy lạc quan: Đó là liệu pháp chống ủ rũ hữu hiệu nhất.","Hãy học cách lắng nghe. Cơ hội có thể gõ cửa rất khẽ khàng.","Khi bạn yêu thích công việc của mình, ngày nào cũng là ngày lễ.","Tham vọng là nhiệt huyết có mục đích.","Kẻ buồn chán nhất là kẻ thấy tất cả mọi người và tất cả mọi việc đều buồn chán.","Giữ nỗi sợ của mình cho riêng mình cũng là một hình thức can đảm.","Tiến bộ trông cậy vào niềm tin rằng mọi thứ luôn có thể tốt đẹp hơn.","Tham vọng mãnh liệt không hữu dụng mấy nếu bạn đi nhầm đường.","Vỏ bọc cải trang mà cơ hội yêu thích nhất là rắc rối.","Cười với người khác là một trong những lạc thú lớn nhất của cuộc đời. Bị người khác cười là một trong những sự tổn thương lớn nhất của cuộc đời.","Tiến bộ không được tạo ra bởi những người an phận.","Nỗi sợ nhạt nhòa khi ta đối diện thực tế.","Hãy biết lắng nghe. Đôi tai bạn sẽ không bao giờ dẫn bạn vào rắc rối.","Thính giác là một trong năm giác quan của con người. Nhưng lắng nghe là nghệ thuật.","Bài thử lớn nhất xem bạn có tính hài hước không là phản ứng của bạn khi có người nói rằng không.","Trí tưởng tượng sống động là một trong những người đồng hành tốt nhất.","Những trí óc đóng chặt đáng sợ hơn nhiều những cánh cửa đóng chặt.","Điều quan trọng nhất phải làm để giải quyết vấn đề là bắt đầu.","Sự chuyên nghiệp là biết phải làm thế nào, phải làm khi nào, và thực hiện điều đó.","Nghệ thuật khuyên bảo nằm ở việc khiến người nhận lời khuyên tin rằng mình tự nghĩ ra điều đó.","Khám phá thường xuất hiện khi người ta không tuân theo chỉ dẫn, khi rời khỏi đường cái, khi thử điều chưa được thử bao giờ.","Thiện chí không thể mua, bạn phải giành được nó.","Thành công sẽ không tự đến với bạn. Bạn phải gặp nó ít nhất giữa đường.","Nếu bạn nhìn đủ sâu, bạn sẽ thấy âm nhạc; trái tim của thiên nhiên là âm nhạc ở khắp nơi.","Không gì xây dựng lòng tự trọng và sự tự tin tốt hơn thành tựu.","Trong những cuốn sách ẩn chứa linh hồn của suốt chiều dài quá khứ.","Trái tim yêu thương là điểm bắt đầu của mọi tri thức.","Tất cả những gì con người đã làm, nghĩ hoặc trở thành: được bảo tồn một cách kỳ diệu trên những trang sách.","Chúng ta sẽ trở thành gì phụ thuộc vào điều chúng ta đọc sau khi tất cả các thầy cô giáo đã xong việc với chúng ta. Trường học vĩ đại nhất chính là sách vở.","Hạnh phúc của con người không nằm ở vận may bên ngoài và có thể nhận biết, nhưng nằm ở sự tốt đẹp và giàu có của tâm hồn, thứ bên trong và không thể nhìn thấy.","Sự thường xuyên, kiên nhẫn và bền bỉ bất chấp mọi trở ngại, nản lòng và những điều tưởng chừng bất khả thi: Trong tất cả mọi việc, nó là sự khác biệt giữa tâm hồn mạnh mẽ và tâm hồn yếu đuối.","Một tâm hồn mạnh mẽ luôn luôn hy vọng, và luôn luôn có động cơ để hy vọng.","Tôi có một tham vọng lớn, đó là chết vì kiệt sức thay vì buồn chán.","Người ta sống nhờ tin vào điều gì đó: không phải nhờ bàn luận và tranh cãi về quá nhiều thứ.","Người có sức khỏe, có hy vọng; và người có hy vọng, có tất cả mọi thứ.","Lòng can đảm mà chúng ta khao khát và tự hào không phải là lòng can đảm để chết tử tế, mà là để sống cho ra sống.","Nỗ lực của một người tốt vô danh cũng như mạch nước ngầm sâu dưới đất, thầm lặng làm mặt đất xanh tươi.","Với tất cả mọi người, tuổi trẻ là mùa hân hoan của cuộc đời; nhưng thường chỉ bởi điều mà nó hy vọng, không phải bởi điều mà nó giành được, hay điều mà nó trốn thoát.","Tính tự cao tự đại là nguồn gốc và lời tóm tắt của tất cả mọi sai lầm và khổ sở.","Tình yêu không không phải toàn bộ đều là cơn mê sảng, nhưng nó có rất nhiều điểm giống.","Những giá trị bên ngoài rồi sẽ biến mất; những giá trị sâu bên trong vẫn luôn như vậy, ngày hôm qua, ngày hôm nay, và mãi mãi.","Viết là công việc nặng nhọc đáng sợ, nhưng không đáng sợ bằng Lười biếng.","Sự bền bỉ là tính kiên nhẫn được tập trung.","Nếu không có kẻ địch, không có cuộc chiến. Nếu không có cuộc chiến, không có chiến thắng, và nếu không có chiến thắng, không có vương miệng.","Hãy đi xa tới hết tầm mắt của mình; khi bạn tới đó, bạn sẽ nhìn được xa hơn nữa.","Lời nói trần tục, sự im lặng thiêng liêng, nhưng cũng tàn bạo và chết chóc: vì thế chúng ta phải học cả hai.","Hãy chỉ cho tôi người anh kính trọng, và tôi sẽ biết anh là người như thế nào. Bởi anh đã cho tôi biết cách nhìn của mình về nhân loại.","Tai ương là bụi kim cương mà Thiên đường dùng để đánh bóng châu báu.","Giá trị của sáng tạo không phải là sự mới mẻ; đó là sự thành thật.","Sự im lặng hùng biện hơn lời nói","Đằng sau mọi lời nói có ý nghĩa đều có sự im lặng tốt đẹp hơn, Sự im lặng sâu sắc như Vĩnh hằng, lời nói nông cạn như Thời gian.","Sự kín đáo là thành tố của mọi điều tốt đẹp; thậm chí cả đức hạnh, thậm chí cả cái đẹp cũng bí ẩn.","Người có tài thấy được điểm mấu chốt, và coi tất cả những thứ khác là dư thừa.","Tôi không tin vào tập hợp trí tuệ chung của những cá nhân ngu dốt.","Tiếng cười là một trong những đặc quyền của lý trí, chỉ xuất hiện ở loài người.","Trong tất cả mọi hành động, ăn năn là hành động cao quý nhất. Tội lỗi nghiêm trọng nhất là không tự ý thức được tội lỗi nào.","Nhiệm vụ đầu tiên của con người là chinh phục nỗi sợ; anh ta phải ném bỏ nó, nếu không, anh ta không thể hành động.","Một người không đọc sách chẳng hơn gì kẻ không biết đọc.","Hãy cẩn thận khi đọc sách về sức khỏe. Bạn có thể bỏ mạng vì một lỗi in ấn.","Nhưng ai sẽ cầu nguyện cho Satan? Trong suốt mười tám thế kỷ, ai là người có lòng nhân ái để cầu nguyện cho kẻ tội lỗi cần nó nhất?","Sự tha thứ là mùi hương mà vi-ô-lét để lại trên gót chân đã dẫm nát nó.","Thà không mở miệng và để người ta nghĩ bạn là kẻ ngu ngốc còn hơn là mở miệng và xóa hết mọi sự nghi ngờ.","Cách tốt nhất để làm bạn vui lên là làm người khác vui lên.","Thà xứng đáng với vinh dự mà không có nó còn hơn là có nó mà không xứng đáng.","Có những người có thể làm được mọi điều tốt và anh hùng, chỉ trừ một việc – không kể hạnh phúc của mình cho người bất hạnh.","Trước 48 tuổi, người bi quan là người biết quá nhiều; nếu quá tuổi đó mà vẫn lạc quan, anh ta biết quá ít.","Không gì đứng vững được trước sự công phá của tiếng cười.","Người ta không lúc nào thành thực hơn khi nhận mình là kẻ dối trá.","Sự tức giận là axit có thể gây hại cho vật chứa nó nhiều hơn là những gì mà nó được đổ lên.","Lòng tốt là thứ ngôn ngữ mà người điếc có thể nghe và người mù có thể thấy.","Cơ bản là có hai loại người. Người làm nên chuyện và người tuyên bố mình làm nên chuyện. Nhóm đầu tiên ít đông hơn.","Bí quyết của thành công là hãy bắt đầu. Bí quyết để bắt đầu là chia nhỏ các công việc nặng nề, phức tạp thành những việc nhỏ dễ quản lý hơn, rồi bắt đầu với việc thứ nhất.","Điều cấm đoán có sức mê hoặc đến nỗi khiến nó hấp dẫn không tả nổi.","Khi anh đi câu tình yêu, hãy lấy trái tim làm mồi chứ đừng lấy bộ não.","Dối trá không nằm trong ngôn từ; nó nằm trong sự việc.","Không phải giọng nói điều khiển câu chuyện: chính là đôi tai.","Tri thức không vô tình mà đạt được. Chúng ta phải tìm kiếm nó với sự nhiệt tình và đạt được nó bằng sự chăm chỉ.","Chúng ta có quá nhiều lời nói hoa mỹ, và có quá ít hành động tương xứng với chúng.","Tôi luôn tin rằng sự thông minh của một người được phản ánh trực tiếp bằng số quan điểm đối lập mà người đó có thể đưa ra cùng lúc về cùng một chủ đề.","Trách nhiệm lớn lao đòi hỏi đức hạnh lớn lao."};
    String scaunoi="";
    String arrtacgia[] = {"Bill Gates","Bill Gates","Bill Gates","Bill Gates","Bill Gates","Bill Gates","Bill Gates","Bill Gates","Bill Gates","Bill Gates","Steve Jobs"," Charlie Chaplin","Mahatma Gandhi","Richard Koch","Moilton Berle"," H.Jackson Brown JR"," Seneca","Eleanor Roosevelt","Walt Disney","Napoleon Hill","George Eliot","Albert Einstein","Samuel Beckett","Samuel Beckett","Samuel Beckett","Samuel Beckett","Samuel Beckett","Samuel Beckett","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","Orlando Aloysius Battista","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","James M. Barrie","Brigitte Bardot","Brigitte Bardot","Brigitte Bardot","Brigitte Bardot","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Balzac","Johann Sebastian Bach","Johann Sebastian Bach","Johann Sebastian Bach","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Jane Austen","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Aristotle","Guillaume Apollinaire","Guillaume Apollinaire","Guillaume Apollinaire","Guillaume Apollinaire","Guillaume Apollinaire","Guillaume Apollinaire","Guillaume Apollinaire","Marie Antoinette","Marie Antoinette","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Gabriel García Márquez","Harper Lee","Harper Lee","Harper Lee","Alexander Hamilton","Alexander Hamilton","Alexander Hamilton","Alexander Hamilton","Alexander Hamilton","Alexander Hamilton",            "Alexander Hamilton","Alexander Hamilton","Alexander Hamilton","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Albert Einstein","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Charlie Chaplin","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Frank Tyger","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Thomas Carlyle","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Mark Twain","Italo Calvino","Italo Calvino","Abigail Adams","Abigail Adams","Abigail Adams","Abigail Adams"};
    String stacgia="";
    Integer[] imageIDs =
            {
                    R.drawable.i2,
                    R.drawable.i3,
                    R.drawable.i4,
                    R.drawable.i5,
                    R.drawable.i6,
                    R.drawable.i7,
                    R.drawable.i8,
                    R.drawable.i9,
                    R.drawable.i10,
                    R.drawable.i11,
                    R.drawable.i12,
                    R.drawable.i13,
                    R.drawable.i14,
                    R.drawable.i15,
                    R.drawable.i16,
                    R.drawable.i17,
                    R.drawable.i18,
                    R.drawable.i19,
                    R.drawable.i20,
                    R.drawable.i21,
                    R.drawable.i22,
                    R.drawable.i23,
                    R.drawable.i24,
                    R.drawable.i25,
                    R.drawable.i26,
                    R.drawable.i27,
                    R.drawable.i28,
                    R.drawable.i29,
                    R.drawable.i30,
                    R.drawable.i31,
                    R.drawable.i32,
                    R.drawable.i33,
                    R.drawable.i34,
                    R.drawable.i35,
                    R.drawable.i36,
                    R.drawable.i37,
                    R.drawable.i38,
                    R.drawable.i39,
                    R.drawable.i40,
                    R.drawable.i41,
                    R.drawable.i42,
                    R.drawable.i43,
                    R.drawable.i44,
                    R.drawable.i45,
                    R.drawable.i46,
                    R.drawable.i47,
                    R.drawable.i48,
                    R.drawable.i49,
                    R.drawable.i50,
                    R.drawable.i51,
                    R.drawable.i52,
                    R.drawable.i53,
                    R.drawable.i54,
                    R.drawable.i55,
                    R.drawable.i56,
                    R.drawable.i57,
                    R.drawable.i58,
                    R.drawable.i59,
                    R.drawable.i60,
                    R.drawable.i61,
                    R.drawable.i62,
                    R.drawable.i63,
                    R.drawable.i64,
                    R.drawable.i65,
                    R.drawable.i66,
                    R.drawable.i67,
                    R.drawable.i68,
                    R.drawable.i69,
                    R.drawable.i70,
                    R.drawable.i71,
                    R.drawable.i72,
                    R.drawable.i73,
                    R.drawable.i74,
                    R.drawable.i75,
                    R.drawable.i76,
                    R.drawable.i77,
                    R.drawable.i78,
                    R.drawable.i79,
                    R.drawable.i80,
                    R.drawable.i81,
                    R.drawable.i82,
                    R.drawable.i83,
                    R.drawable.i84,
                    R.drawable.i85,
                    R.drawable.i86,
                    R.drawable.i87,
                    R.drawable.i88,
                    R.drawable.i89,
                    R.drawable.i90,
                    R.drawable.i91,
                    R.drawable.i92,
                    R.drawable.i93,
                    R.drawable.i94,
                    R.drawable.i95,
                    R.drawable.i96,
                    R.drawable.i97,
                    R.drawable.i98,
                    R.drawable.i99,
                    R.drawable.i100,
                    R.drawable.i101,
                    R.drawable.i102,
                    R.drawable.i103,
                    R.drawable.i104,
                    R.drawable.i105,
                    R.drawable.i106,
                    R.drawable.i107,
                    R.drawable.i108,
                    R.drawable.i109,
                    R.drawable.i110,
                    R.drawable.i111,
                    R.drawable.i112,
                    R.drawable.i113,
                    R.drawable.i114,
                    R.drawable.i115,
                    R.drawable.i116,
                    R.drawable.i117,
                    R.drawable.i118,
                    R.drawable.i119,
                    R.drawable.i120,
                    R.drawable.i121,
                    R.drawable.i122,
                    R.drawable.i123,
                    R.drawable.i124,
                    R.drawable.i125,
                    R.drawable.i126,
                    R.drawable.i127,
                    R.drawable.i128,
                    R.drawable.i129,
                    R.drawable.i130,
                    R.drawable.i131,
                    R.drawable.i132,
                    R.drawable.i133,
                    R.drawable.i134,
                    R.drawable.i135,
                    R.drawable.i136,
                    R.drawable.i137,
                    R.drawable.i138,
                    R.drawable.i139,
                    R.drawable.i140,
                    R.drawable.i141,
                    R.drawable.i142,
                    R.drawable.i143,
                    R.drawable.i144,
                    R.drawable.i145,
                    R.drawable.i146,
                    R.drawable.i147,
                    R.drawable.i148,
                    R.drawable.i149,
                    R.drawable.i150,
                    R.drawable.i151,
                    R.drawable.i152,
                    R.drawable.i153,
                    R.drawable.i154,
                    R.drawable.i155,
                    R.drawable.i156,
                    R.drawable.i157,
                    R.drawable.i158,
                    R.drawable.i159,
                    R.drawable.i160,
                    R.drawable.i161,
                    R.drawable.i162,
                    R.drawable.i163,
                    R.drawable.i164,
                    R.drawable.i165,
                    R.drawable.i166,
                    R.drawable.i167,
                    R.drawable.i168,
                    R.drawable.i169,
                    R.drawable.i170,
                    R.drawable.i171,
                    R.drawable.i172,
                    R.drawable.i173,
                    R.drawable.i174,
                    R.drawable.i175,
                    R.drawable.i176,
                    R.drawable.i177,
                    R.drawable.i178,
                    R.drawable.i179,
                    R.drawable.i180,
                    R.drawable.i181,
                    R.drawable.i182,
                    R.drawable.i183,
                    R.drawable.i184,
                    R.drawable.i185,
                    R.drawable.i186,
                    R.drawable.i187,
                    R.drawable.i188,
                    R.drawable.i189,
                    R.drawable.i190,
                    R.drawable.i191,
                    R.drawable.i192,
                    R.drawable.i193,
                    R.drawable.i194,
                    R.drawable.i195,
                    R.drawable.i196,
                    R.drawable.i197,
                    R.drawable.i198,
                    R.drawable.i199,
                    R.drawable.i200,
                    R.drawable.i201,
                    R.drawable.i202,
                    R.drawable.i203,
                    R.drawable.i204,
                    R.drawable.i205,
                    R.drawable.i206,
                    R.drawable.i207,
                    R.drawable.i208,
                    R.drawable.i209,
                    R.drawable.i210,
                    R.drawable.i211,
                    R.drawable.i212,
                    R.drawable.i213,
                    R.drawable.i214,
                    R.drawable.i215,
                    R.drawable.i216,
                    R.drawable.i217,
                    R.drawable.i218,
                    R.drawable.i219,
                    R.drawable.i220,
                    R.drawable.i221,
                    R.drawable.i222,
                    R.drawable.i223,
                    R.drawable.i224,
                    R.drawable.i225,
                    R.drawable.i226,
                    R.drawable.i227,
                    R.drawable.i228,
                    R.drawable.i229,
                    R.drawable.i230,
                    R.drawable.i231,
                    R.drawable.i232,
                    R.drawable.i233,
                    R.drawable.i234,
                    R.drawable.i235,
                    R.drawable.i236,
                    R.drawable.i237,
                    R.drawable.i238,
                    R.drawable.i239,
                    R.drawable.i240,
                    R.drawable.i241,
                    R.drawable.i242,
                    R.drawable.i243,
                    R.drawable.i244,
                    R.drawable.i245,
                    R.drawable.i246,
                    R.drawable.i247,
                    R.drawable.i248,
                    R.drawable.i249,
                    R.drawable.i250,
                    R.drawable.i251,
                    R.drawable.i252,
                    R.drawable.i253,
                    R.drawable.i254,
                    R.drawable.i255,
                    R.drawable.i256,
                    R.drawable.i257,
                    R.drawable.i258,
                    R.drawable.i259,
                    R.drawable.i260,
                    R.drawable.i261,
                    R.drawable.i262,
                    R.drawable.i263,
                    R.drawable.i264,
                    R.drawable.i265,
                    R.drawable.i266,
                    R.drawable.i267,
                    R.drawable.i268,
                    R.drawable.i269,
                    R.drawable.i270,
                    R.drawable.i271,
                    R.drawable.i272,
                    R.drawable.i273,
                    R.drawable.i274,
                    R.drawable.i275,
                    R.drawable.i276,
                    R.drawable.i277,
                    R.drawable.i278,
                    R.drawable.i279,
                    R.drawable.i280,
                    R.drawable.i281,
                    R.drawable.i282,
                    R.drawable.i283,
                    R.drawable.i284,
                    R.drawable.i285,
                    R.drawable.i286,
                    R.drawable.i287,
                    R.drawable.i288,
                    R.drawable.i289,
                    R.drawable.i290,
                    R.drawable.i291,
                    R.drawable.i292,
                    R.drawable.i293,
                    R.drawable.i294,
                    R.drawable.i295,
                    R.drawable.i296,
                    R.drawable.i297,
                    R.drawable.i298,
                    R.drawable.i299,
                    R.drawable.i300,
                    R.drawable.i301,
                    R.drawable.i302,
                    R.drawable.i303,
                    R.drawable.i304,
                    R.drawable.i305,
                    R.drawable.i306,
                    R.drawable.i307,
                    R.drawable.i308,
                    R.drawable.i309,
                    R.drawable.i310,
                    R.drawable.i311,
                    R.drawable.i312,
                    R.drawable.i313,
                    R.drawable.i314,
                    R.drawable.i315,
                    R.drawable.i316,
                    R.drawable.i317,
                    R.drawable.i318,
                    R.drawable.i319,
                    R.drawable.i320,
                    R.drawable.i321,
                    R.drawable.i322,
                    R.drawable.i323,
                    R.drawable.i324,
                    R.drawable.i325,
                    R.drawable.i326,
                    R.drawable.i327,
                    R.drawable.i328,
                    R.drawable.i329,
                    R.drawable.i330,
                    R.drawable.i331,
                    R.drawable.i332,
                    R.drawable.i333,
                    R.drawable.i334,
                    R.drawable.i335,
                    R.drawable.i336,
                    R.drawable.i337,
                    R.drawable.i338,
                    R.drawable.i339,
                    R.drawable.i340,
                    R.drawable.i341,
                    R.drawable.i342,
                    R.drawable.i343,
                    R.drawable.i344,
                    R.drawable.i345,
                    R.drawable.i346,
                    R.drawable.i347,
                    R.drawable.i348,
                    R.drawable.i349,
                    R.drawable.i350,
                    R.drawable.i351,
                    R.drawable.i352,
                    R.drawable.i353,
                    R.drawable.i354,
                    R.drawable.i355,
                    R.drawable.i356,
                    R.drawable.i357,
                    R.drawable.i358,
                    R.drawable.i359,
                    R.drawable.i360,
                    R.drawable.i361,
                    R.drawable.i362,
                    R.drawable.i363,
                    R.drawable.i364,
                    R.drawable.i365
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtvthang = (TextView) findViewById(R.id.thang);
        final TextView txtvthu = (TextView) findViewById(R.id.thu);
        final TextView txtvthuso = (TextView) findViewById(R.id.thuso);
        final TextView txtvnam = (TextView) findViewById(R.id.nam);
        final TextView txtvnote = (TextView) findViewById(R.id.note);
        final TextView txtvcaunoi = (TextView) findViewById(R.id.caunoi);
        final TextView txtvtacgia = (TextView) findViewById(R.id.tacgia);
        final TextView txtvchitiet = (TextView) findViewById(R.id.chitiet);
        final TextView txtvamlich = (TextView) findViewById(R.id.amlich);
        final TextView txtvamlichngay = (TextView) findViewById(R.id.amlichngay);
        final TextView txtvhoangdao = (TextView) findViewById(R.id.hoangdao);
        final ImageView imageView = (ImageView) findViewById(R.id.hinhanh);
        final EditText txtvghichutext = (EditText) findViewById(R.id.ghichutext);
        final EditText nhapthang = (EditText) findViewById(R.id.nhapthang);
        final EditText nhapngay = (EditText) findViewById(R.id.nhapngay);
        final TextView txtvpage = (TextView) findViewById(R.id.page);
        nhapngay.setText(nhapngay.getText().toString());
        nhapthang.setText(nhapthang.getText().toString());
        Button tim = (Button) findViewById(R.id.tim);
        tim.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       so1 = Integer.parseInt(nhapthang.getText().toString());
                                       so2 = Integer.parseInt(nhapngay.getText().toString());
                                       if (so1 == 1 && so2 == 1) {
                                           page = 0;
                                           thang = 1;
                                           ngay = 1;
                                           thu = 0;
                                           ngayamlich = 4;
                                           thangamlich = 12;
                                           i = -1;
                                           txtvthang.setText("THÁNG "+thang.toString());
                                           txtvthu.setText("CHỦ NHẬT");
                                           txtvthuso.setText(ngay.toString());
                                           txtvnam.setText("NĂM 2017");
                                           imageView.setImageResource(R.drawable.i1);
                                           txtvnote.setText("NOTE");
                                           txtvcaunoi.setText("HAPPY NEW YEAR");
                                           txtvtacgia.setText("");
                                           txtvamlich.setText("THÁNG " + thangamlich.toString());
                                           txtvamlichngay.setText(ngayamlich.toString());
                                           txtvpage.setText(page.toString());
                                           nhapthang.setText("");
                                           nhapngay.setText("");
                                       }
                                       else {
                                           if (so1 == 1)
                                           {
                                               if (so2 > 1 && so2 < 28) {
                                                   thangamlich = 12;
                                                   ngayamlich = so2 + 3;
                                               }
                                               if (so2 > 27 && so2 < 32) {
                                                   thangamlich = 1;
                                                   ngayamlich = so2 - 27;
                                               }
                                               page = so2 - 1;
                                               thu = so2 - 1;
                                               i = so2 - 2;
                                           }
                                           if (so1 == 2) {
                                               if (so2 >= 1 && so2 < 26) {
                                                   ngayamlich = 4 + so2;
                                                   thangamlich = 1;
                                               }
                                               if (so2 > 26 && so2 < 29) {
                                                   ngayamlich = so2 - 25;
                                                   thangamlich = 2;
                                               }
                                               page = 30 + so2;
                                               i = 29 + so2;
                                               thu = so2 + 2;
                                           }
                                           if (so1 == 3) {
                                               if (so2 >= 1 && so2 < 28) {
                                                   ngayamlich = so2 + 3;
                                                   thangamlich = 2;
                                               }
                                               if (so2 > 27 && so2 < 32) {
                                                   ngayamlich = so2 - 27;
                                                   thangamlich = 3;
                                               }
                                               page = 58 + so2;
                                               i = 57 + so2;
                                               thu = so2 + 2;
                                           }
                                           if (so1 == 4) {
                                               if (so2 >= 1 && so2 < 26) {
                                                   ngayamlich = 4 + so2;
                                                   thangamlich = 3;
                                               }
                                               if (so2 > 25 && so2 < 31) {
                                                   ngayamlich = so2 - 25;
                                                   thangamlich = 4;
                                               }
                                               page = 89 + so2;
                                               thu = so2 + 5;
                                               i = 88 + so2;
                                           }
                                           if (so1 == 5) {
                                               if (so2 >= 1 && so2 < 26) {
                                                   ngayamlich = 5 + so2;
                                                   thangamlich = 4;
                                               }
                                               if (so2 > 25 && so2 < 32) {
                                                   ngayamlich = so2 - 25;
                                                   thangamlich = 5;
                                               }
                                               page = 119 + so2;
                                               thu = so2;
                                               i = 118 + so2;
                                           }
                                           if (so1 == 6) {
                                               if (so2 >= 1 && so2 < 24) {
                                                   ngayamlich = 6 + so2;
                                                   thangamlich = 5;
                                               }
                                               if (so2 > 23 && so2 < 31) {
                                                   ngayamlich = so2 - 23;
                                                   thangamlich = 6;
                                               }
                                               page = 150 + so2;
                                               thu = so2 + 3;
                                               i = 149 + so2;
                                           }
                                           if (so1 == 7) {
                                               if (so2 >= 1 && so2 < 23) {
                                                   ngayamlich = 7 + so2;
                                                   thangamlich = 6;
                                               }
                                               if (so2 > 22 && so2 < 32) {
                                                   ngayamlich = so2 - 22;
                                                   thangamlich = 6;
                                               }
                                               page = 180 + so2;
                                               thu = so2 + 5;
                                               i = 179 + so2;
                                           }
                                           if (so1 == 8) {
                                               if (so2 >= 1 && so2 < 22) {
                                                   ngayamlich = 9 + so2;
                                                   thangamlich = 6;
                                               }
                                               if (so2 > 21 && so2 < 32) {
                                                   ngayamlich = so2 - 21;
                                                   thangamlich = 7;
                                               }
                                               page = 211 + so2;
                                               thu = so2 + 1;
                                               i = 210 + so2;
                                           }
                                           if (so1 == 9) {
                                               if (so2 >= 1 && so2 < 20) {
                                                   ngayamlich = 10 + so2;
                                                   thangamlich = 7;
                                               }
                                               if (so2 > 19 && so2 < 31) {
                                                   ngayamlich = so2 - 19;
                                                   thangamlich = 8;
                                               }
                                               page = 242 + so2;
                                               thu = so2 + 4;
                                               i = 241 + so2;
                                           }
                                           if (so1 == 10) {
                                               if (so2 >= 1 && so2 < 20) {
                                                   ngayamlich = 11 + so2;
                                                   thangamlich = 8;
                                               }
                                               if (so2 > 19 && so2 < 32) {
                                                   ngayamlich = so2 - 19;
                                                   thangamlich = 9;
                                               }
                                               page = 272 + so2;
                                               thu = so2 + 6;
                                               i = 271 + so2;
                                           }
                                           if (so1 == 11) {
                                               if (so2 >= 1 && so2 < 18) {
                                                   ngayamlich = 12 + so2;
                                                   thangamlich = 9;
                                               }
                                               if (so2 > 17 && so2 < 31) {
                                                   ngayamlich = so2 - 17;
                                                   thangamlich = 10;
                                               }
                                               page = 303 + so2;
                                               thu = so2 + 2;
                                               i = 302 + so2;
                                           }
                                           if (so1 == 12) {
                                               if (so2 >= 1 && so2 < 18) {
                                                   ngayamlich = 13 + so2;
                                                   thangamlich = 10;
                                               }
                                               if (so2 > 17 && so2 < 32) {
                                                   ngayamlich = so2 - 17;
                                                   thangamlich = 11;
                                               }
                                               page = 333 + so2;
                                               thu = so2 + 4;
                                               i = 332 + so2;
                                           }
                                           thang = so1;
                                           ngay = so2;
                                           bienthu = thu % 7;
                                           scaunoi = arrcaunoi[i];
                                           stacgia = arrtacgia[i];
                                           switch (bienthu) {
                                               case 0:
                                                   sthu = s0;
                                                   break;
                                               case 1:
                                                   sthu = s1;
                                                   break;
                                               case 2:
                                                   sthu = s2;
                                                   break;
                                               case 3:
                                                   sthu = s3;
                                                   break;
                                               case 4:
                                                   sthu = s4;
                                                   break;
                                               case 5:
                                                   sthu = s5;
                                                   break;
                                               case 6:
                                                   sthu = s6;
                                                   break;

                                           }
                                           txtvthang.setText("THÁNG "+so1.toString());
                                           txtvthu.setText(sthu);
                                           txtvthuso.setText(ngay.toString());
                                           txtvnam.setText("NĂM 2017");
                                           imageView.setImageResource(imageIDs[i]);
                                           txtvnote.setText("NOTE");
                                           txtvghichutext.setText("");
                                           txtvcaunoi.setText(scaunoi);
                                           txtvtacgia.setText(stacgia);
                                           txtvamlich.setText("THÁNG " + thangamlich.toString());
                                           txtvamlichngay.setText(ngayamlich.toString());
                                           txtvpage.setText(page.toString());
                                           nhapngay.setText("");
                                           nhapthang.setText("");

                                       }
                                   }

                               }

        );

        Button truoc = (Button) findViewById(R.id.truoc);
        truoc.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         if(page==1||page==0)
                                         {
                                             page=0;
                                             thang=1;
                                             ngay=1;
                                             thu=0;
                                             ngayamlich=4;
                                             thangamlich=12;
                                             i=-1;
                                             txtvthang.setText("THÁNG "+thang.toString());
                                             txtvthu.setText("CHỦ NHẬT");
                                             txtvthuso.setText("1");
                                             txtvnam.setText("NĂM");
                                             imageView.setImageResource(R.drawable.i1);
                                             txtvnote.setText("NOTE");
                                             txtvghichutext.setText("");
                                             txtvcaunoi.setText("HAPPY NEW YEAR");
                                             txtvtacgia.setText("");
                                             txtvamlich.setText("THÁNG " + thangamlich.toString());
                                             txtvamlichngay.setText(ngayamlich.toString());
                                             txtvpage.setText(page.toString());
                                         }
                                         else
                                         {
                                             --ngay;
                                             --ngayamlich;
                                             --thu;
                                             --page;
                                             if (ngay == 0 & (thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12))
                                             {
                                                 thang--;
                                                 ngay = 30;
                                             }
                                             if (thang == 3 && ngay == 0)
                                             {
                                                 thang--;
                                                 ngay = 28;
                                             }
                                             if (ngay == 0 && (thang ==2||thang == 4 || thang == 6 || thang == 9 || thang == 11))
                                             {
                                                 thang--;
                                                 ngay = 31;
                                             }
                                             if (ngayamlich == 0&&(thangamlich==1||thangamlich==3||thangamlich==5||thangamlich==7||thangamlich==9||thangamlich==11))
                                             {
                                                 thangamlich--;
                                                 ngayamlich = 30;
                                             }
                                             if (ngayamlich == 0&&(thangamlich==2||thangamlich==4||thangamlich==8||thangamlich==10||thangamlich==6))
                                             {
                                                 thangamlich--;
                                                 ngayamlich = 29;
                                             }
                                             --i;
                                             bienthu = thu % 7;
                                             scaunoi = arrcaunoi[i];
                                             stacgia = arrtacgia[i];
                                             switch (bienthu) {
                                                 case 0:
                                                     sthu = s0;
                                                     break;
                                                 case 1:
                                                     sthu = s1;
                                                     break;
                                                 case 2:
                                                     sthu = s2;
                                                     break;
                                                 case 3:
                                                     sthu = s3;
                                                     break;
                                                 case 4:
                                                     sthu = s4;
                                                     break;
                                                 case 5:
                                                     sthu = s5;
                                                     break;
                                                 case 6:
                                                     sthu = s6;
                                                     break;

                                             }
                                             txtvthang.setText("THÁNG "+thang.toString());
                                             txtvthu.setText(sthu);
                                             txtvthuso.setText(ngay.toString());
                                             txtvnam.setText("NĂM 2017");
                                             imageView.setImageResource(imageIDs[i]);
                                             txtvnote.setText("NOTE");
                                             txtvghichutext.setText("");
                                             txtvcaunoi.setText(scaunoi);
                                             txtvtacgia.setText(stacgia);
                                             txtvamlich.setText("THÁNG " + thangamlich.toString());
                                             txtvamlichngay.setText(ngayamlich.toString());
                                             txtvpage.setText(page.toString());
                                         }
                                     }
                                 }
        );

        Button sau = (Button) findViewById(R.id.sau);
        sau.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {

                                       if (page == 364)
                                       {
                                           txtvthang.setText("THÁNG 12");
                                           txtvthu.setText("CHỦ NHẬT");
                                           txtvthuso.setText("31");
                                           txtvnam.setText("NĂM 2017");
                                           imageView.setImageResource(R.drawable.i365);
                                           txtvnote.setText("NOTE");
                                           txtvghichutext.setText("");
                                           txtvcaunoi.setText("Tôi luôn tin rằng sự thông minh của một người được phản ánh trực tiếp bằng số quan điểm đối lập mà người đó có thể đưa ra cùng lúc về cùng một chủ đề.");
                                           txtvtacgia.setText("Abigail Adams");
                                           txtvamlich.setText("THÁNG 11");
                                           txtvamlichngay.setText("14");
                                           txtvpage.setText("364");
                                       }
                                       else
                                       {
                                           ++ngay;
                                           ++ngayamlich;
                                           ++thu;
                                           ++page;
                                           if (ngay == 32 && (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12)) {
                                               thang++;
                                               ngay = 1;
                                           }
                                           if (thang == 2 && ngay == 29) {
                                               thang++;
                                               ngay = 1;
                                           }
                                           if (ngay == 31 && (thang == 4 || thang == 6 || thang == 9 || thang == 11)) {
                                               thang++;
                                               ngay = 1;
                                           }
                                           if (ngayamlich == 31 && (thangamlich == 12 || thangamlich == 2 || thangamlich == 4 || thangamlich == 8 || thangamlich == 10 || thangamlich == 11)) {
                                               thangamlich++;
                                               ngayamlich = 1;
                                               if (thangamlich == 13) {
                                                   thangamlich = 1;
                                               }
                                           }
                                           if (ngayamlich == 30 && (thangamlich == 1 || thangamlich == 3 || thangamlich == 5 || thangamlich == 7 || thangamlich == 9)) {
                                               thangamlich++;
                                               ngayamlich = 1;
                                           }
                                           if (ngayamlich == 30 && thangamlich == 6&&thang==7)
                                           {
                                               thangamlich = 6;
                                               ngayamlich = 1;
                                           }
                                           if (ngayamlich == 31 && thangamlich == 6 )
                                           {
                                               thangamlich++;
                                               ngayamlich = 1;
                                           }
                                           ++i;
                                           bienthu = thu % 7;
                                           scaunoi = arrcaunoi[i];
                                           stacgia = arrtacgia[i];
                                           switch (bienthu) {
                                               case 0:
                                                   sthu = s0;
                                                   break;
                                               case 1:
                                                   sthu = s1;
                                                   break;
                                               case 2:
                                                   sthu = s2;
                                                   break;
                                               case 3:
                                                   sthu = s3;
                                                   break;
                                               case 4:
                                                   sthu = s4;
                                                   break;
                                               case 5:
                                                   sthu = s5;
                                                   break;
                                               case 6:
                                                   sthu = s6;
                                                   break;

                                           }
                                           txtvthang.setText("THÁNG "+thang.toString());
                                           txtvthu.setText(sthu);
                                           txtvthuso.setText(ngay.toString());
                                           txtvnam.setText("NĂM 2017");
                                           imageView.setImageResource(imageIDs[i]);
                                           txtvnote.setText("NOTE");
                                           txtvghichutext.setText("");
                                           txtvcaunoi.setText(scaunoi);
                                           txtvtacgia.setText(stacgia);
                                           txtvamlich.setText("THÁNG " + thangamlich.toString());
                                           txtvamlichngay.setText(ngayamlich.toString());
                                           txtvpage.setText(page.toString());
                                       }
                                   }
                               }

        );
    }
}
