package lk.inli.algorithms;

public class WordConstruct {

	public static void main(String[] args) {
		/*System.out.println("lmno: " + biggerIsGreater("lmno"));
		System.out.println("dcba: " + biggerIsGreater("dcba"));
		System.out.println("dcbb: " + biggerIsGreater("dcbb"));
		System.out.println("abdc: " + biggerIsGreater("abdc"));
		System.out.println("abcd: " + biggerIsGreater("abcd"));
		System.out.println("fedcbabcd: " + biggerIsGreater("fedcbabcd"));*/
		
		/*System.out.println("ba".equals(biggerIsGreater("ab")));
		System.out.println("no answer".equals(biggerIsGreater("bb")));
		System.out.println("hegf".equals(biggerIsGreater("hefg")));
		System.out.println("dhkc".equals(biggerIsGreater("dhck")));
		System.out.println("hcdk".equals(biggerIsGreater("dkhc")));
		System.out.println("habcdk".equals(biggerIsGreater("dkhcba")));

		System.out.println("no answer".equals(biggerIsGreater("100000")));
		System.out.println("no answer".equals(biggerIsGreater("zyyyvvvvvuttsrqqokjjheedccb")));
		System.out.println("vvvygfabrsqeitgelpxwodhdfyypoyufxnecmrtkbzbhzfbtvnffcmikqoosfzoozssonomkgmtdqfecrqtsp".equals(biggerIsGreater("vvvygfabrsqeitgelpxwodhdfyypoyufxnecmrtkbzbhzfbtvnffcmikqoosfzoozssonomkgmtdqfecrqtps")));
		System.out.println("chntqzcpvrhvzvpywuhxombxcsjlpserzg".equals(biggerIsGreater("chntqzcpvrhvzvpywuhxombxcsjlpsergz")));
		System.out.println("bvulomthrfugqfbaknxginokekugbem".equals(biggerIsGreater("bvulomthrfugqfbaknxginokekuemgb")));
		System.out.println("phoatpygflfo".equals(biggerIsGreater("phoatpygffol")));
		System.out.println("gqesmwwfyyuraiwzhdkyvtzprhxzfaocdyxryzpqyewfufkspwvpgyscviersewdcgudhjxnfximarbkgduma".equals(biggerIsGreater("gqesmwwfyyuraiwzhdkyvtzprhxzfaocdyxryzpqyewfufkspwvpgyscviersewdcgudhjxnfximarbkgduam")));
		System.out.println("no answer".equals(biggerIsGreater("dc")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzyyxxxwvvvvusssrrrrqqqqqqqppoonnnnmmmmllllkjiiigfccccbbba")));
		System.out.println("no answer".equals(biggerIsGreater("zxwutljib")));
		System.out.println("mzvzrnkxfbznkhmppqwyvmywfmsgmtvxtaxqdmqdryszwmzuvlkvlcpfpa".equals(biggerIsGreater("mzvzrnkxfbznkhmppqwyvmywfmsgmtvxtaxqdmqdryszwmzuvlkvlcpfap")));
		System.out.println("no answer".equals(biggerIsGreater("zyyywvvvuttttsssrqponnmllkjjjihgggfffedccbbbaaaa")));
		System.out.println("skmidbvygtsdvujmuckkdbceeffrodszmkfrgugelljlxzribxlhltvxgigxfhotkaxejrvymhrengddobeckxhbgxamf".equals(biggerIsGreater("skmidbvygtsdvujmuckkdbceeffrodszmkfrgugelljlxzribxlhltvxgigxfhotkaxejrvymhrengddobeckxhbgxafm")));
		System.out.println("dkuwfemgcce".equals(biggerIsGreater("dkuwfemegcc")));
		System.out.println("nlvhfxgkmsqddkuhfmfjklwcunbnqovmswqlkpjjkuboploggtzdcmjhezsjdvvawlkizfkmfrjkqv".equals(biggerIsGreater("nlvhfxgkmsqddkuhfmfjklwcunbnqovmswqlkpjjkuboploggtzdcmjhezsjdvvawlkizfkmfqvrkj")));
		System.out.println("pgnxoizoihrjmybvtyckzsjrxuejyxogxaczxbkndrmboloxaurzpviididhkeph".equals(biggerIsGreater("pgnxoizoihrjmybvtyckzsjrxuejyxogxaczxbkndrmboloxaurzpviididhkehp")));
		System.out.println("bdmkhyleclldykvysxkfttkipzdmkexxhmdtdabxjzuxgyvlzyheeb".equals(biggerIsGreater("bdmkhyleclldykvysxkfttkipzdmkexxhmdtdabxjzuxgyvlzyhebe")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzxxuutttsrrrqqppnmmkjihhgffddddcbbbaaa")));
		System.out.println("imsyqfpkimjwewbgofakdnblqiamevajfsydpdifzexrprbghap".equals(biggerIsGreater("imsyqfpkimjwewbgofakdnblqiamevajfsydpdifzexrprbgaph")));
		System.out.println("no answer".equals(biggerIsGreater("zwqnnjhfccba")));
		System.out.println("dtwfgnvmippxcpppjpsyfzhvwnehthaylypapifheb".equals(biggerIsGreater("dtwfgnvmippxcpppjpsyfzhvwnehthaylypapifhbe")));
		System.out.println("xqopdmvkppfbsoybf".equals(biggerIsGreater("xqopdmvkppfbsofyb")));
		System.out.println("hihjflgiyruykigzarpxmhwnpbhfyrhdkcawripafpxhjugcjsgwijzhlauxlutpylcqlsaauveehodlyjowssuim".equals(biggerIsGreater("hihjflgiyruykigzarpxmhwnpbhfyrhdkcawripafpxhjugcjsgwijzhlauxlutpylcqlsaauveehodlyjowssmui")));*/
		
		/*System.out.println("zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgwm".equals(biggerIsGreater("zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgmw")));
		System.out.println("no answer".equals(biggerIsGreater("zyyxwwtrrnmlggfeb")));
		System.out.println("ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlfc".equals(biggerIsGreater("ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlcf")));
		System.out.println("biehzcmjckznhwrfgglverxsjepquxz".equals(biggerIsGreater("biehzcmjckznhwrfgglverxsezxuqpj")));
		System.out.println("rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmyms".equals(biggerIsGreater("rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmsym")));
		System.out.println("unpzhmbgrsr".equals(biggerIsGreater("unpzhmbgrrs")));
		System.out.println("jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqxgp".equals(biggerIsGreater("jprfovzkdlmdcesdcpdchcwoedjchcovklhrhlzfeeptoewcqpxg")));
		System.out.println("ywsfmynmiylcjgrfrrmtyeeykffzkuphpajndwxjtjabey".equals(biggerIsGreater("ywsfmynmiylcjgrfrrmtyeeykffzkuphpajndwxjteyjba")));
		System.out.println("dkuashjzsqd".equals(biggerIsGreater("dkuashjzsdq")));
		System.out.println("gwakhcpkolybihkmxyecrdhsvycjrljajlmlqgpcnmvvkjlkvdowzdfkhi".equals(biggerIsGreater("gwakhcpkolybihkmxyecrdhsvycjrljajlmlqgpcnmvvkjlkvdowzdfikh")));
		System.out.println("nebsajjbbuifimjpdcqfygeitife".equals(biggerIsGreater("nebsajjbbuifimjpdcqfygeitief")));
		System.out.println("qetpicxagjkydehfnvfxrtigljlheulcsfidjjozbsnomygqbcmpffwswptbgkzrbgqwnczrcfynjmhebfbgseuhckbtuynvob".equals(biggerIsGreater("qetpicxagjkydehfnvfxrtigljlheulcsfidjjozbsnomygqbcmpffwswptbgkzrbgqwnczrcfynjmhebfbgseuhckbtuynvbo")));
		System.out.println("xuqfobndhsnsztifmqpnencxkllnpmbfqihtgdgxjhsvitlgtodhcyfbd".equals(biggerIsGreater("xuqfobndhsnsztifmqpnencxkllnpmbfqihtgdgxjhsvitlgtodhcydfb")));
		System.out.println("xqdwkjpkmrvkfnztozzlqtuxzxyxwwfo".equals(biggerIsGreater("xqdwkjpkmrvkfnztozzlqtuxzxyxwowf")));
		System.out.println("yewluyxiwiprnajrtkeilolkmqidazhira".equals(biggerIsGreater("yewluyxiwiprnajrtkeilolkmqidazhiar")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyxxxxxwwwwwvvvvutttttsssssrrrrqqqppponnnnmmmmllkkjjjjiiggffffffeedddddbbbbbba")));
		System.out.println("hlvpzsfwnzsazeyaxaczkkrstiilkldupsqmzjnnsyooa".equals(biggerIsGreater("hlvpzsfwnzsazeyaxaczkkrstiilkldupsqmzjnnsyoao")));
		System.out.println("no answer".equals(biggerIsGreater("zxvuutttrrrpoookiihhgggfdca")));
		System.out.println("no answer".equals(biggerIsGreater("zzyxxxxwwwvvuuuutsrrrrrqppppoooonnnnnnmmmlllllkkkjjjihgeeedddddcbaaa")));
		System.out.println("jnmvvaybncmoazujefictednlyjuhonfchvpqfelcbw".equals(biggerIsGreater("jnmvvaybncmoazujefictednlyjuhonfchvpqfelbwc")));
		System.out.println("mqyvczrlabtesyeiteblqklfhkchcryggkewpsfxsumvsjerssbltntydzwrvfj".equals(biggerIsGreater("mqyvczrlabtesyeiteblqklfhkchcryggkewpsfxsumvsjerssbltntydzwrjvf")));
		System.out.println("pzxgfnsapnczh".equals(biggerIsGreater("pzxgfnsapnchz")));
		System.out.println("erwidqokyjfpctpfxuojyloafghxgifdvhcmzjogoqoikjhjngbhfetvtraaojkfqvyujbhdizrkvqmfpzbidysbkhvuerbt".equals(biggerIsGreater("erwidqokyjfpctpfxuojyloafghxgifdvhcmzjogoqoikjhjngbhfetvtraaojkfqvyujbhdizrkvqmfpzbidysbkhvuebtr")));
		System.out.println("xywhpljspfeiznzisvukwcaizeqwgavokqwxkrotsgchxdupsumgcynfrpcjsylnrzgxdfkctcrkcnvkxgtmiabghcorgnxka".equals(biggerIsGreater("xywhpljspfeiznzisvukwcaizeqwgavokqwxkrotsgchxdupsumgcynfrpcjsylnrzgxdfkctcrkcnvkxgtmiabghcorgnxak")));
		System.out.println("ywghcadvjurpjgwgfysi".equals(biggerIsGreater("ywghcadvjurpjgwgfyis")));
		System.out.println("pqommldkafmnwzidydgjghxcbnwyjdxpvmkztdfmcxlkargafjzyee".equals(biggerIsGreater("pqommldkafmnwzidydgjghxcbnwyjdxpvmkztdfmcxlkargafjzeye")));
		System.out.println("victjarfqkynoavgmhtpzbpcrblzyrzyxjrjlwjxmxdslsubyqdcqcdoenufzxqlyt".equals(biggerIsGreater("victjarfqkynoavgmhtpzbpcrblzyrzyxjrjlwjxmxdslsubyqdcqcdoenufzxqlty")));
		System.out.println("tlxqigvjmfuxuk".equals(biggerIsGreater("tlxqigvjmfuxku")));
		System.out.println("cryrpwccrnspwnruubekqkjmrkvwoohzvkctejwvkqfarqgbjzbggyxmecpshgcccydjkl".equals(biggerIsGreater("cryrpwccrnspwnruubekqkjmrkvwoohzvkctejwvkqfarqgbjzbggyxmecpshgccclykjd")));
		System.out.println("jhrmxpdfhjjubrycaurjjwvkasfyxkfj".equals(biggerIsGreater("jhrmxpdfhjjubrycaurjjwvkasfyxjkf")));
		System.out.println("asc".equals(biggerIsGreater("acs")));
		System.out.println("aeukmuqpwyrrdkoptlawlpxknjhdnzlzrgfzliojgopwvwafzxyiwevsxwmwlxycppmjlpxafdnpioezfdkyafxry".equals(biggerIsGreater("aeukmuqpwyrrdkoptlawlpxknjhdnzlzrgfzliojgopwvwafzxyiwevsxwmwlxycppmjlpxafdnpioezfdkyafryx")));
		System.out.println("no answer".equals(biggerIsGreater("zvtronmlkkihc")));
		System.out.println("no answer".equals(biggerIsGreater("zzzyyyyxxxxwwwwwvvuuuuuuuttttsssrrrqqqqpppooooonnnnmmmllkjjjjiiiiihhhgggfeeeddcccbbbaa")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyxxxwwwwvvvvuuuutrrqqqqppoooonnmmllkkkjjjiihhhggfffeeebbbbbbbbb")));
		System.out.println("dinodxkbrsipxfznzevrpbgtrrfbbfdaksagsnu".equals(biggerIsGreater("dinodxkbrsipxfznzevrpbgtrrfbbfdaksagnus")));
		System.out.println("sykgwoyzypukuditxxltlunmkbnz".equals(biggerIsGreater("sykgwoyzypukuditxxltlunmbznk")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyyxxxxxwwwwvuuuuttttssrrrrpppponnnmmmmlllllkkkkjjjiiiiiiggfffffeeeddccbbba")));
		System.out.println("spceooivwyzjfbejljaizdvrdkeipvetcxvzmkmwuuqdndwuhxdmrmitzsgjcipanobhxphdactouymoky".equals(biggerIsGreater("spceooivwyzjfbejljaizdvrdkeipvetcxvzmkmwuuqdndwuhxdmrmitzsgjcipanobhxphdactouymkyo")));
		System.out.println("iekgvftshvqkkbbxrhhgypngmekykkshhmphfjhcflfknwcxqrearjzsfpryvtahsjawpdufwuqroyckgphn".equals(biggerIsGreater("iekgvftshvqkkbbxrhhgypngmekykkshhmphfjhcflfknwcxqrearjzsfpryvtahsjawpdufwuqroyckgnph")));
		System.out.println("jwzgvwcljudksghspryqrbjaylokhccptiligqndzswxqtafrunwflkgfrhgkapd".equals(biggerIsGreater("jwzgvwcljudksghspryqrbjaylokhccptiligqndzswxqtafrunwflkgfrhgkadp")));
		System.out.println("jvbodrobnjihwpnvlyxlixtsakm".equals(biggerIsGreater("jvbodrobnjihwpnvlyxlixtmska")));
		System.out.println("mllfsvfzllbloukxtonftmlmioqdsdxstdzmyamtnu".equals(biggerIsGreater("mllfsvfzllbloukxtonftmlmioqdsdxstdzmyamnut")));
		System.out.println("mexyunrrcglszqwzatguscgvukuyenogubuwwiavudhvzbpgwjwxazvdzfgumudbgtaubmxyqrzbeagjrthedvvmrngxlilczvo".equals(biggerIsGreater("mexyunrrcglszqwzatguscgvukuyenogubuwwiavudhvzbpgwjwxazvdzfgumudbgtaubmxyqrzbeagjrthedvvmrngxlilczov")));
		System.out.println("shsdzboibebzlfluhgkypbppkxvtgmf".equals(biggerIsGreater("shsdzboibebzlfluhgkypbppkxvtgfm")));
		System.out.println("wvokkqbmgbnwrbdlzwqfanzxtwiqasxgqnwvrlhwnhlhbxkx".equals(biggerIsGreater("wvokkqbmgbnwrbdlzwqfanzxtwiqasxgqnwvrlhwnhlhbkxx")));
		System.out.println("nennccrmeeflwmpqfvgtiapirdbjjqozvtbrmixnonbhddgxxpt".equals(biggerIsGreater("nennccrmeeflwmpqfvgtiapirdbjjqozvtbrmixnonbhddgxtxp")));
		System.out.println("wffbownokzqkxgobgxclscwbsgeaxbozfcftxiugiahpufilwuhdmugsotdzatvdvuhumq".equals(biggerIsGreater("wffbownokzqkxgobgxclscwbsgeaxbozfcftxiugiahpufilwuhdmugsotdzatvdvuhqum")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzyyyxxxxwvvvuuuuuttssssssrrrqqqqqppppppponmmmmmlllkkjjihhggfeeeeeddddccbaaaaa")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzzzzyyxxwwwvvuuuuuuttttsssssrrrrqqqqpooonnnmmmmmmmmllllkkjjiihhhgggfffffeeeeedddddccccbbbbaa")));
		System.out.println("no answer".equals(biggerIsGreater("zyyyyxxxxwwwwwvvuuttttssrrqqpponnmkjjjihhggggfffeddddcccccbbbba")));
		System.out.println("qspxfpochvrcznsnlnhbqivxoeyuzxuicrzalvgvlyiaahtyvsheiuug".equals(biggerIsGreater("qspxfpochvrcznsnlnhbqivxoeyuzxuicrzalvgvlyiaahtyvsheiugu")));
		System.out.println("vxkednatrbquuohianxvddurldvgixajksbanctmgbixaysryritnzgkstzjm".equals(biggerIsGreater("vxkednatrbquuohianxvddurldvgixajksbanctmgbixaysryritnzgkstmzj")));
		System.out.println("lgevfu".equals(biggerIsGreater("lgeuvf")));
		System.out.println("dqwrsem".equals(biggerIsGreater("dqwrmse")));
		System.out.println("no answer".equals(biggerIsGreater("ywwwsqonmkjjjec")));
		System.out.println("txhibpmgdirkxudpkstbowpseyphnisizqdokoguywt".equals(biggerIsGreater("txhibpmgdirkxudpkstbowpseyphnisizqdokoguytw")));
		System.out.println("hrdajqwelhktmhuvvoifamrvjeorhjsyvfdqdlzjwlcyjyrpneebqozuepvhcwfxqhdvpocxmunlyvzpzl".equals(biggerIsGreater("hrdajqwelhktmhuvvoifamrvjeorhjsyvfdqdlzjwlcyjyrpneebqozuepvhcwfxqhdvpocxmunlyvzplz")));
		System.out.println("no answer".equals(biggerIsGreater("zxkjhfa")));
		System.out.println("no answer".equals(biggerIsGreater("zywvvvvvrrrqnmmmmljjjihggffeeca")));
		System.out.println("argjsmasazkmoumtergvyxabrkxsaawcgupxalkz".equals(biggerIsGreater("argjsmasazkmoumtergvyxabrkxsaawcgupxakzl")));
		System.out.println("smbqkwxekxykpraflhoeiiodhhqfqobgsschrbqebxxarwoekpruqezanmvjvxeqbectjkkrgnvsdiuvp".equals(biggerIsGreater("smbqkwxekxykpraflhoeiiodhhqfqobgsschrbqebxxarwoekpruqezanmvjvxeqbectjkkrgnvsdiupv")));
		System.out.println("no answer".equals(biggerIsGreater("lg")));
		System.out.println("cnkowxwrzzlgclchm".equals(biggerIsGreater("cnkowxwrzzlgchmlc")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyyyxxxxxxvvvuuutttttttssssrrrqqqqppppooonnnnmmmlllkkkjjjjjiiihggggfeeeeccccccbbbbbaaaaa")));
		System.out.println("xormxhloqwvqhokclhrgojnbqwbekwhpscodduptogwmbyamqgykbastrsnzmwtmjnfnufsdenioemdcppzt".equals(biggerIsGreater("xormxhloqwvqhokclhrgojnbqwbekwhpscodduptogwmbyamqgykbastrsnzmwtmjnfnufsdenioemdcpptz")));
		System.out.println("onapfkqihlffxgbazbbyojidwuauptlshcxircaigbcaiyeucyvfhvzrjgbwhlbnbammvf".equals(biggerIsGreater("onapfkqihlffxgbazbbyojidwuauptlshcxircaigbcaiyeucyvfhvzrjgbwhlbnbammfv")));
		System.out.println("ifcjnisxizrnbcvhqamdzmnnvpqwnqrkaeikckeqfpmpcfxlcfepajhlmkfuypolachz".equals(biggerIsGreater("ifcjnisxizrnbcvhqamdzmnnvpqwnqrkaeikckeqfpmpcfxlcfepajhlmkfuypohzlca")));
		System.out.println("orrswtbuzvhwczrteudswqeurrszkaxshzhkuiokrylmfrulucpbhpyunrupovplucdbmwnsobwhaolduruwaokipsbjpndwg".equals(biggerIsGreater("orrswtbuzvhwczrteudswqeurrszkaxshzhkuiokrylmfrulucpbhpyunrupovplucdbmwnsobwhaolduruwaokipsbjpndgw")));
		System.out.println("tngzrqwtnynlqraucsusxocvmbsowkgpedzsabrqifcvnzjczbewjdwqlx".equals(biggerIsGreater("tngzrqwtnynlqraucsusxocvmbsowkgpedzsabrqifcvnzjczbewjdwlxq")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzzzzyyxxwwvvvvvuuuuuutttttsssrrrrqqqqqppppooonnnnnnmmmmllllkjjjiiiihhhhgggggggfffeeeeddcccbbbaa")));
		System.out.println("ynwjdeyufytvgltwzdjnzkafnzwlndzrixrjkcc".equals(biggerIsGreater("ynwjdeyufytvgltwzdjnzkafnzwlndzrixrjckc")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyyywwwvvvvuuuutttssssrrqqppoonnnnnnmmmllkkkjihhhgggfffffedddccbbba")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyyyyxxwwwvvuttttsssrqqqpppnnnnmlllkjihhhhhgggggfffffeeedddccbbaa")));
		System.out.println("byvakxxmcvchxbhjbvagzizpionjtkwfqyohceyizlxurtcufj".equals(biggerIsGreater("byvakxxmcvchxbhjbvagzizpionjtkwfqyohceyizlxurtcjuf")));
		System.out.println("qzealllnle".equals(biggerIsGreater("qzealllnel")));
		System.out.println("gloqevnhjakswofqijvscfjmqmmjaexrfbthwr".equals(biggerIsGreater("gloqevnhjakswofqijvscfjmqmmjaexrfbthrw")));
		System.out.println("cexnnzkvgzwulp".equals(biggerIsGreater("cexnnzkvgzwpul")));
		System.out.println("tdngrnhtaaarrmsirxmuekxginkvtsqhxj".equals(biggerIsGreater("tdngrnhtaaarrmsirxmuekxginkvtsqhjx")));
		System.out.println("gxfbcmzkpcywzudenlrpenxudmjliaqkmbqbixmtlgmbvevxqjzvjpuptiprdsixrccv".equals(biggerIsGreater("gxfbcmzkpcywzudenlrpenxudmjliaqkmbqbixmtlgmbvevxqjzvjpuptiprdsixcvrc")));
		System.out.println("piy".equals(biggerIsGreater("iyp")));
		System.out.println("csidwjlcdvlonqwyemsgnafxnhdldklckq".equals(biggerIsGreater("csidwjlcdvlonqwyemsgnafxnhdldkkqlc")));
		System.out.println("no answer".equals(biggerIsGreater("zyyxwuusrrqqpnlkkihhggfedd")));
		System.out.println("zbnhddyreqgbtljfomybooayzoqcn".equals(biggerIsGreater("zbnhddyreqgbtljfomybooayzonqc")));
		System.out.println("hdatwgziwm".equals(biggerIsGreater("hdatwgzimw")));
		System.out.println("ckxvkrzzv".equals(biggerIsGreater("ckxvkrzvz")));
		System.out.println("kpyosibsuarrdszbigsjyzschcvgvjgmd".equals(biggerIsGreater("kpyosibsuarrdszbigsjyzschcvgvjgdm")));
		System.out.println("smdwubtiauxbxducxwvvmvgonttkjuqcfijmnsgzlqkhahxqwweikzajdthkmiuehnktdduyucewvbdlsyjgcdzsauyhrirz".equals(biggerIsGreater("smdwubtiauxbxducxwvvmvgonttkjuqcfijmnsgzlqkhahxqwweikzajdthkmiuehnktdduyucewvbdlsyjgcdzsauyhizrr")));
		System.out.println("uywkqzfktgiuftdffdynxuscrkbvkebxxjpiphxgbxnwnyp".equals(biggerIsGreater("uywkqzfktgiuftdffdynxuscrkbvkebxxjpiphxgbxnwnpy")));
		System.out.println("zntwynbyancmzkzkeosyttmnmricnr".equals(biggerIsGreater("zntwynbyancmzkzkeosyttmnmrcrni")));
		System.out.println("jfparzxakugmylshaeolgganbfewidnydcjqcheggboslytohvccilurdacgehgvnsaerfeolibaovblefocyvbxlhtdubqjjhtg".equals(biggerIsGreater("jfparzxakugmylshaeolgganbfewidnydcjqcheggboslytohvccilurdacgehgvnsaerfeolibaovblefocyvbxlhtdubqjjhgt")));
		System.out.println("gmnxmbdpmyhmrneqizayztprhikykwvwmbnicvlqdemwmdxcftssoaakneetykphegqcgjbmmcklmin".equals(biggerIsGreater("gmnxmbdpmyhmrneqizayztprhikykwvwmbnicvlqdemwmdxcftssoaakneetykphegqcgjbmmcklinm")));
		System.out.println("vymnloaaxlmvtykujflnklcxeulzfzyryxmtrvmglysjkj".equals(biggerIsGreater("vymnloaaxlmvtykujflnklcxeulzfzyryxmtrvmglysjjk")));
		System.out.println("qdnkfqvedqeqnmvzbravyismqksgjzxsklrlxfvuoufwomsanbntlws".equals(biggerIsGreater("qdnkfqvedqeqnmvzbravyismqksgjzxsklrlxfvuoufwomsanbntlsw")));
		System.out.println("vmjfqifbkuvlrasxswadnrlgvb".equals(biggerIsGreater("vmjfqifbkuvlrasxswadnrlgbv")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzzzzyyyxxxvvuutttttsssrrrrrrqqqppppoooonnnmmlllkkkkjiiihggfffeeddccccaaaaa")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzyxxxwwwwwvuuuuuttttssssrrrrqqqqqqqppppnnnmmlllllllkkjjjiiiihhhhggffffeeedddddcccbbbbaaaaaaaa")));
		System.out.println("wztgcfqzzokkcrrgzwhcrzm".equals(biggerIsGreater("wztgcfqzzokkcrrgzwhcrmz")));
		System.out.println("gxilexhvbcjlkoxcigxoxxgzdvvyqqytrqyvlkhrkqmijdbau".equals(biggerIsGreater("gxilexhvbcjlkoxcigxoxxgzdvvyqqytrqyvlkhrkqmijdaub")));
		System.out.println("fzeeqhkqgermnyeclldhvlrrxpamfipdhlbcizvaiaeqfvkq".equals(biggerIsGreater("fzeeqhkqgermnyeclldhvlrrxpamfipdhlbcizvaiaeqfqvk")));
		System.out.println("umdloczurkxgwpqrtfxxeovjoshaaehxlkptetuaibvdccapdyuqdexshnupw".equals(biggerIsGreater("umdloczurkxgwpqrtfxxeovjoshaaehxlkptetuaibvdccapdyuqdexshnpwu")));
		System.out.println("uwpogzxwisqytrneixc".equals(biggerIsGreater("uwpogzxwisqytrneicx")));
		System.out.println("rdgcmqmvrttnfmcljaarwidmpfrhdgbghmrhcfmzywzkmpoarwzaydoxazsqaylhyblvzjcdidknknvoqecyuqddcdphrurt".equals(biggerIsGreater("rdgcmqmvrttnfmcljaarwidmpfrhdgbghmrhcfmzywzkmpoarwzaydoxazsqaylhyblvzjcdidknknvoqecyuqddcdphrtur")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzzyyxxxxxxwvvvuuuuuuttttsssssssrrrqqqqpppooonnnnnnnmmmmmllkkjjjjjiiiihhgffeeeddcccbbbbbaa")));
		System.out.println("no answer".equals(biggerIsGreater("yyxxxxwvtspponllkkkhggeeccb")));
		System.out.println("stcxkgphwqmxmxdhug".equals(biggerIsGreater("stcxkgphwqmxmxdhgu")));
		System.out.println("ajjrvukvuycqgblvsene".equals(biggerIsGreater("ajjrvukvuycqgblvseen")));
		System.out.println("znzsbnvktalcaxflmeoxoymqlynbvumvetfulxrcertnun".equals(biggerIsGreater("znzsbnvktalcaxflmeoxoymqlynbvumvetfulxrcertnnu")));
		System.out.println("bcoeobimzvgyekbsaeywpevxtdfzrhdwebgkrllllvjzyccbnzpswf".equals(biggerIsGreater("bcoeobimzvgyekbsaeywpevxtdfzrhdwebgkrllllvjzyccbnzpsfw")));
		System.out.println("no answer".equals(biggerIsGreater("zyyyyyyxxxwwwwwwvuuttttssrrrrrqqqqqqqqppponmllkkkkjjjiiiiihhgggeeeedddbbaaa")));
		System.out.println("uajtplgqrnfllzernkxpy".equals(biggerIsGreater("uajtplgqrnfllzernkpyx")));
		System.out.println("magiikdggkseqxwmhiyuclxkfmholkyfrmawzntreslgdrjgwxtuhnd".equals(biggerIsGreater("magiikdggkseqxwmhiyuclxkfmholkyfrmawzntreslgdrjgwxtuhdn")));
		System.out.println("jpzdmurumlpxuoinxnyfboydakzlzvlsphxjtgo".equals(biggerIsGreater("jpzdmurumlpxuoinxnyfboydakzlzvlsphxjotg")));
		System.out.println("ctboqszhpuxprivjilebnuirvqpyypimqyoqxj".equals(biggerIsGreater("ctboqszhpuxprivjilebnuirvqpyypimqyoqjx")));
		System.out.println("no answer".equals(biggerIsGreater("srpoong")));
		System.out.println("euxilfyocpktwjmdsdtvfppwrojdochmftvaa".equals(biggerIsGreater("euxilfyocpktwjmdsdtvfppwrojdochmftava")));
		System.out.println("no answer".equals(biggerIsGreater("zzyxxwwwwwvvvvvuuuussrrrrrrrqqqqppoonnnnnmmmmllllkkkjjjjjjiihhhggggggfffeeeeeddcccccbbaa")));
		System.out.println("ejlionwskjkekljhailpqssiermqlvzhprbtjjojhebgvtnjjkydbtogkndu".equals(biggerIsGreater("ejlionwskjkekljhailpqssiermqlvzhprbtjjojhebgvtnjjkydbtogkdun")));
		System.out.println("no answer".equals(biggerIsGreater("zyyvuutsssrrqqqqppoonnmmmmmllkjjihhffeedddcccbaa")));
		System.out.println("rhxxlmsdesyhtlvyxypmhnkocmgolpnswtlxyzscnskfjtwdllsaavihvjwekxuaexcnpjg".equals(biggerIsGreater("rhxxlmsdesyhtlvyxypmhnkocmgolpnswtlxyzscnskfjtwdllsaavihvjwekxuaexcnpgj")));
		System.out.println("uyulzovqgbgjksatwimsnxlivmardqtwinsvbkcwoufwnwwtptuaizzycpwecpmtckbexgtgumvawmtihixkpoprdvvahb".equals(biggerIsGreater("uyulzovqgbgjksatwimsnxlivmardqtwinsvbkcwoufwnwwtptuaizzycpwecpmtckbexgtgumvawmtihixkpoprdvvabh")));
		System.out.println("adqmcmewlexzjicgmyrdfwyn".equals(biggerIsGreater("adqmcmewlexzjicgmyrdfwny")));
		System.out.println("no answer".equals(biggerIsGreater("zyyxxvvvussrrppooonmlkkjjiiiiihhhggfffeeccccbbaa")));
		System.out.println("sygavaioeieeexadnlkbetfudoukhfzbkfqyxxpiue".equals(biggerIsGreater("sygavaioeieeexadnlkbetfudoukhfzbkfqyxxpieu")));
		System.out.println("no answer".equals(biggerIsGreater("zzxwwwvuuttsrqqoommljihgffeeeddcccbbaa")));
		System.out.println("zzcwzursvkcnrkvtwyklxnoxtcsdyrsqqduzjbc".equals(biggerIsGreater("zzcwzursvkcnrkvtwyklxnoxtcsdyrsqqduzcjb")));
		System.out.println("xqrxjghdr".equals(biggerIsGreater("xqrxjgdrh")));
		System.out.println("bautenujswyspcflteeubhsoiesjizppkdeqkwzbxvcpfxabhwoarnvptozvcklbnmcvmcfwhegenhjpsckkdcafcdrrfypyyvf".equals(biggerIsGreater("bautenujswyspcflteeubhsoiesjizppkdeqkwzbxvcpfxabhwoarnvptozvcklbnmcvmcfwhegenhjpsckkdcafcdrrfypyyfv")));
		System.out.println("tbccxtryegfgchapyoiajdlqsxlznwimbkdpffydufrmfctdioqylildumlpzngnmeytohkdyxzofnesauo".equals(biggerIsGreater("tbccxtryegfgchapyoiajdlqsxlznwimbkdpffydufrmfctdioqylildumlpzngnmeytohkdyxzofnesaou")));
		System.out.println("no answer".equals(biggerIsGreater("zyyyxvuuttttssrrrqqqqqqpponnmmmmlllllkkkjjjiihhhhgggfffffffeddcccbbbaaaaaaa")));
		System.out.println("rjfhvqgbdbcowzwcpyzbkhoedfyzcwcpqncejnrtcqldfdgqpphocamcpiarucgnyhyockklexhdrmveorzpourrzgnbczwwkoo".equals(biggerIsGreater("rjfhvqgbdbcowzwcpyzbkhoedfyzcwcpqncejnrtcqldfdgqpphocamcpiarucgnyhyockklexhdrmveorzpourrzgnbczwowok")));
		System.out.println("no answer".equals(biggerIsGreater("zyyyxuuusrqppokjjhggeddc")));
		System.out.println("no answer".equals(biggerIsGreater("zyyxwwwvvuuuuurrrqqpoonnnmmmllllkkkkjiiiihhhhhhgggfeddddcbbbaa")));
		System.out.println("gbduppvqwduxqzmofjmcstdrmedzipikhqmikjtyqidhznvhpfdljohtsnzzhnwasjirnkrzffllxxzlehhrfeixwws".equals(biggerIsGreater("gbduppvqwduxqzmofjmcstdrmedzipikhqmikjtyqidhznvhpfdljohtsnzzhnwasjirnkrzffllxxzlehhrfeixwsw")));
		System.out.println("no answer".equals(biggerIsGreater("xtddc")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzzyyyyyxxxwvvvvuuuttsssqqpppppoonmmlllkkkkkkjjjiiiihhhgggggffedcbbbbbbaaaa")));
		System.out.println("ezpwqktcjikdyqpwmpqycotisjnptratw".equals(biggerIsGreater("ezpwqktcjikdyqpwmpqycotisjnptawtr")));
		System.out.println("lemqpsouysjigkglhhsmcfqwqbpwyibtkmyvoersrvxhwcmatsnjdqcblrmcwxwsqix".equals(biggerIsGreater("lemqpsouysjigkglhhsmcfqwqbpwyibtkmyvoersrvxhwcmatsnjdqcblrmcwxwsixq")));
		System.out.println("no answer".equals(biggerIsGreater("zzzyyyxxxxwwwwvvvvvuuuuttttttsssrrrrrqqppooooonnnnnmmmmmmmmlllkkjjjiihhhgggffeeeeddddddccccbbba")));
		System.out.println("zitvgmuezkfqorwwkzwgg".equals(biggerIsGreater("zitvgmuezkfqorwwkzgwg")));
		System.out.println("rjtvxqevfhlzhnjhkzyfnxtjpqhlrwhkiyygevqamadvfewzkgxwuicuauit".equals(biggerIsGreater("rjtvxqevfhlzhnjhkzyfnxtjpqhlrwhkiyygevqamadvfewzkgxwuicuatui")));
		System.out.println("no answer".equals(biggerIsGreater("zywwwvussrqpoooonnnmlkkjjjiiigffeeeeddbbaa")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzzzzyyyyyyyxwtttrrqqqqqqqqpppoonnnnnnllkkjjjhhgffeddcbb")));
		System.out.println("kliqncgylbkblxb".equals(biggerIsGreater("kliqncgylbkblbx")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzyyyyxwwvvuusssrrqqpoonnnnmllllkkjjjjiiihhggggfedddddcccbbba")));
		System.out.println("gbsbacdhcllxkicnjybetudgp".equals(biggerIsGreater("gbsbacdhcllxkicnjybetpugd")));
		System.out.println("yknajxmifwzfaqnakxfkhtzqdjttdqxwnklurtgjrevozqevkolbltzumyve".equals(biggerIsGreater("yknajxmifwzfaqnakxfkhtzqdjttdqxwnklurtgjrevozqevkolbltzumyev")));
		System.out.println("no answer".equals(biggerIsGreater("zzzyyyyxxwwvvuuuuttssssrrrrqqponnnllllkkjjiihhgggfffeeeddcccbbaa")));
		System.out.println("qnfsbolfgmuoixyhuutbgzbhzrjkzmbpflrfjxirefewflyixiukkygunqtbrashgporfuuupazulrmfobtnwyszlsaqdn".equals(biggerIsGreater("qnfsbolfgmuoixyhuutbgzbhzrjkzmbpflrfjxirefewflyixiukkygunqtbrashgporfuuupazulrmfobtnwyszlsanqd")));
		System.out.println("vkuvcqrhkealgmyroaiyvwlpmotlxeoiomk".equals(biggerIsGreater("vkuvcqrhkealgmyroaiyvwlpmotlxeoiokm")));
		System.out.println("no answer".equals(biggerIsGreater("rnkg")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzyyxwwwwwvuutttssrrrrrqonnnnnmllkkkhhggffeddddaaa")));
		System.out.println("no answer".equals(biggerIsGreater("zyyyyxxwvvuutttsssrrqppooonnmmljjjiiihgffeeeddaa")));
		System.out.println("qadkpegvcxqedtcakzryzeon".equals(biggerIsGreater("qadkpegvcxqedtcakzryzeno")));
		System.out.println("hexxtmqzalisfoltvdtrdbydqumlhxjwmstzcswmeczyenpxxjistirucdbjlvwtxssmczkacwoqt".equals(biggerIsGreater("hexxtmqzalisfoltvdtrdbydqumlhxjwmstzcswmeczyenpxxjistirucdbjlvwtxssmczkactwqo")));*/
		System.out.println("no answer".equals(biggerIsGreater("c")));
		/*System.out.println("bfogvbblhrxvqcpnbgsjtalvxbwwrenforjtqzwxajyhnmleaqhrgmriyy".equals(biggerIsGreater("bfogvbblhrxvqcpnbgsjtalvxbwwrenforjtqzwxajyhnmleaqhrgmiyyr")));
		System.out.println("tboiediibzdhmbcvkhhzxaecqhidipfznuy".equals(biggerIsGreater("tboiediibzdhmbcvkhhzxaecqhidipfyzun")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyyyxxwwwwwwvvuuttssssrrrqqqppppooonnnmmmmlkkjjiiiiiihhhgggggffffeeeeedbbbaaaaa")));
		System.out.println("qnaho".equals(biggerIsGreater("qhona")));
		System.out.println("jrezcpaolatjniteqotdvlbakvstczotgawppurzlmgplafmdhtzfmxemgz".equals(biggerIsGreater("jrezcpaolatjniteqotdvlbakvstczotgawppurzlmgplafmdhtzfmxegzm")));
		System.out.println("rsuzyqpwimjpobbljfehhoztcgcopskczdjqaqkfbirfducarsfwowfwdwoigyogzswaesxhiloovlhizksqchdh".equals(biggerIsGreater("rsuzyqpwimjpobbljfehhoztcgcopskczdjqaqkfbirfducarsfwowfwdwoigyogzswaesxhiloovlhizksqcdhh")));
		System.out.println("squgtpsijhqpqvfbvldseqerinejdiivrqjflpphtkycofrkuzrvwucohhvoylqafwervlhiscwvfbbmhevgmccbrpgnwptxhr".equals(biggerIsGreater("squgtpsijhqpqvfbvldseqerinejdiivrqjflpphtkycofrkuzrvwucohhvoylqafwervlhiscwvfbbmhevgmccbrpgnwptrxh")));
		System.out.println("zsaoowaqaxpzznrnqpgbhceilqiwmkhzvgjfgxnnuvgyertduujacjsojzqeyveunykveozxptczxhdbw".equals(biggerIsGreater("zsaoowaqaxpzznrnqpgbhceilqiwmkhzvgjfgxnnuvgyertduujacjsojzqeyveunykveozxptczxhbwd")));
		System.out.println("svpwuzswxnersdnxinuhdibtenaqaxbfpwhpukocdxcyxqgfxocxehavcphdhykrkahapoopbsyvmegemla".equals(biggerIsGreater("svpwuzswxnersdnxinuhdibtenaqaxbfpwhpukocdxcyxqgfxocxehavcphdhykrkahapoopbsyvmegemal")));
		System.out.println("mkynizhujrmsvcsxmzuaqlfqojrqjemdiylrdzepfkcglcz".equals(biggerIsGreater("mkynizhujrmsvcsxmzuaqlfqojrqjemdiylrdzepfkcgczl")));
		System.out.println("gdoifkdruwjfqusqjuejfhpfuofruuzwqbeqtgtzcywfobuahlvbfwoyvubdhdxzqkdbpymkuxkhjwtnxovhrfvhpar".equals(biggerIsGreater("gdoifkdruwjfqusqjuejfhpfuofruuzwqbeqtgtzcywfobuahlvbfwoyvubdhdxzqkdbpymkuxkhjwtnxovhrfvharp")));
		System.out.println("jkgfwixeiyiysnqacgdqiwiwfcoqkduxkx".equals(biggerIsGreater("jkgfwixeiyiysnqacgdqiwiwfcoqkdukxx")));
		System.out.println("no answer".equals(biggerIsGreater("yyyxwwwvuutsppoooonnmmmmmllllllkjjiiiihhgffffeeeeddccbbaa")));
		System.out.println("no answer".equals(biggerIsGreater("unla")));
		System.out.println("tldvsxwvultqfvhssslaqgcwybb".equals(biggerIsGreater("tldvsxwvultqfvhssslaqgcwbyb")));
		System.out.println("avalnynihooqffxwkmszzrh".equals(biggerIsGreater("avalnynihooqffxwkmszzhr")));
		System.out.println("zuqutviqjswdvzxltpauwz".equals(biggerIsGreater("zuqutviqjswdvzxltazwup")));
		System.out.println("kedtqohbrwhmsbshszmqgxrvlxfdtbvkxzedhi".equals(biggerIsGreater("kedtqohbrwhmsbshszmqgxrvlxfdtbvkxzdihe")));
		System.out.println("xeacxhmgwhloekcsdlakqyvnstviukeshdumodknocmdavsqfmsqvijibrqmowvywyme".equals(biggerIsGreater("xeacxhmgwhloekcsdlakqyvnstviukeshdumodknocmdavsqfmsqvijibrqmowvywyem")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzyyyyyxxxwwwwvuuuuutttssrrrqqqqqqpppoonnnmmllkkjjiihhhhgggggfffffeeeedddddcccccccbbbaaa")));
		System.out.println("lhnlpedsxrjgzphkxutyuwlz".equals(biggerIsGreater("lhnlpedsxrjgzphkxutyulzw")));
		System.out.println("no answer".equals(biggerIsGreater("zzyyyyyxwwvvuuuuuutrrqqqooonnmmmllkkjjjjiiihhgffeedcbbbbaaa")));
		System.out.println("vpmocjvecftzduodrzwizrerthjqsqipmppuizvkgkcoovlx".equals(biggerIsGreater("vpmocjvecftzduodrzwizrerthjqsqipmppuizvkgkcoolxv")));
		System.out.println("no answer".equals(biggerIsGreater("zzzzzzyxxxxwwwvvvvuuuuutttttttrrrrrrqqqqqqpoooonnnnnmmmmllkkkjjjiihhhhgggggfffeeeeedcbbbbbaa")));
		System.out.println("narmzzbpsrzsvnomwjwdxjjzejkyltbuxrhboigixaujnos".equals(biggerIsGreater("narmzzbpsrzsvnomwjwdxjjzejkyltbuxrhboigixasuonj")));
		System.out.println("wdfljugbxiixrkmcsdl".equals(biggerIsGreater("wdfljugbxiixrkmclsd")));
		System.out.println("xuaeatmgytwpucvwotbdaszojedvbevhimytpfmpqpfhhytfouvxeqqbelnymtgurnzkr".equals(biggerIsGreater("xuaeatmgytwpucvwotbdaszojedvbevhimytpfmpqpfhhytfouvxeqqbelnymtgurnrzk")));
		System.out.println("bljjtzssvfltmezjyslaapugukzuolxlqbiyafcyqqqxqdzb".equals(biggerIsGreater("bljjtzssvfltmezjyslaapugukzuolxlqbiyafcyqqqxqdbz")));
		System.out.println("mxxmucdrzdnjmqteknlknetqrnwokpoehtvjhyxzlzlamsyzjckwpekdobsaeexfxdswmcashnbomsidmsupmsq".equals(biggerIsGreater("mxxmucdrzdnjmqteknlknetqrnwokpoehtvjhyxzlzlamsyzjckwpekdobsaeexfxdswmcashnbomsidmsupmqs")));
		System.out.println("vikubzlvqsxhwclpdlmn".equals(biggerIsGreater("vikubzlvqsxhwclnpmld")));
		System.out.println("vopkkhvwyuanzaiyarolelqosaovjfaycjprttacptznfjmxjmkhwvrerimxsdngbuvjpbjpuipjzoqyfotvcwahrhryz".equals(biggerIsGreater("vopkkhvwyuanzaiyarolelqosaovjfaycjprttacptznfjmxjmkhwvrerimxsdngbuvjpbjpuipjzoqyfotvcwahhzyrr")));
		System.out.println("tiufzfrxickoablpkguyavpdlyvtevdvhvcrjcxrvwrbscfkjcnshixgrrgdhwvc".equals(biggerIsGreater("tiufzfrxickoablpkguyavpdlyvtevdvhvcrjcxrvwrbscfkjcnshixgrrgdhwcv")));
		System.out.println("no answer".equals(biggerIsGreater("zyywvvvuuttttsssrrqpppoooonnnmlllkkkjjiiiihhhgggfeeeddcccccba")));
		System.out.println("glzysciwqufetsicpkerejuxjsvwkeskcmbdeadxhsfbyqikzwjifrijfrbrydefbmcuhrukdsyofetulmwzefhlfxxe".equals(biggerIsGreater("glzysciwqufetsicpkerejuxjsvwkeskcmbdeadxhsfbyqikzwjifrijfrbrydefbmcuhrukdsyofetulmwzefhlfxex")));
		System.out.println("no answer".equals(biggerIsGreater("zyxwvvvvuuutsrrrrpppppoonnnmmkjjjiiiiihhgggfeeeeeeeddcccccbbaaaaa")));
		System.out.println("rqyankutdtkztqlxjnfyzjnoqwilbwvjjjruzy".equals(biggerIsGreater("rqyankutdtkztqlxjnfyzjnoqwilbwvjjjruyz")));
		System.out.println("vhtzuluuuxhaafqwzsbdifnukabiajfioskpibvvniuvfyxtxgfuabkoklbykikzrhgrzjfwyaagzpsfdovyoyqbrpovx".equals(biggerIsGreater("vhtzuluuuxhaafqwzsbdifnukabiajfioskpibvvniuvfyxtxgfuabkoklbykikzrhgrzjfwyaagzpsfdovyoyqbroxvp")));
		System.out.println("ryuqlmmehrcsbiqodqpjxnsupakedbrhymwfphnpemmwxsbufhxitfujnthresuwnqbstomdcfufwkkgw".equals(biggerIsGreater("ryuqlmmehrcsbiqodqpjxnsupakedbrhymwfphnpemmwxsbufhxitfujnthresuwnqbstomdcfufwkgwk")));
		System.out.println("sfjvwrcy".equals(biggerIsGreater("sfjvwcyr")));
		System.out.println("xokehcencnpzsawvtrytxlewznnayt".equals(biggerIsGreater("xokehcencnpzsawvtrytxlewznnaty")));
		System.out.println("petilfdqgwzaxpmbboaqknpfzfyfzfknvyhvfppsuhbnabanbbyjfxsulfgbzwmqaycgob".equals(biggerIsGreater("petilfdqgwzaxpmbboaqknpfzfyfzfknvyhvfppsuhbnabanbbyjfxsulfgbzwmqaycgbo")));
		System.out.println("bwsvyszdxgokozbwuleporgmnownohvywxtbsulwvfalipxnymclqpxpkywejjklsuqaqvzjssjzqejhmogpkeaz".equals(biggerIsGreater("bwsvyszdxgokozbwuleporgmnownohvywxtbsulwvfalipxnymclqpxpkywejjklsuqaqvzjssjzqejhmogpkaze")));
		System.out.println("slhvjimtzctgmowtujjclbwzucqjxzdmamgjdolbtokhiugonehlulazozmaiadwuqmpudiiaakdsrpjoqzhskobwjfjpyrwqje".equals(biggerIsGreater("slhvjimtzctgmowtujjclbwzucqjxzdmamgjdolbtokhiugonehlulazozmaiadwuqmpudiiaakdsrpjoqzhskobwjfjpyrwqej")));
		System.out.println("oqqpozlzkcggpsddcnzwmbdbxdkcstooiwnfkgnggzemcopqatvryeyooehfdovfkqwnluurkncrpofcqboqgvoslpwujo".equals(biggerIsGreater("oqqpozlzkcggpsddcnzwmbdbxdkcstooiwnfkgnggzemcopqatvryeyooehfdovfkqwnluurkncrpofcqboqgvoslpwouj")));*/

	}

	static String biggerIsGreater(String w) {
		String word1 = moveBiggerCharBackword(w);

		return word1;
	}
	
	private static String moveBiggerCharBackword(String w) {
		char[] chars = w.toCharArray();
		//System.out.println("moveBiggerCharBackword b4 swap: " + new String(chars));

		if (w.length() == 1) {
			return "no answer";
		} else if (w.length() == 2 && w.charAt(0) < w.charAt(1)) {
			char c = chars[0];
			chars[0] = chars[1];
			chars[1] = c;
			
			return new String(chars);
		} else if (w.length() == 2 && w.charAt(0) >= w.charAt(1)) {
			return "no answer";
		}
		
		for (int i=w.length()-2; i>=0; i--) {
			char atPos = chars[i];
			//System.out.println("1st char at " + i + ": " + atPos);

			for (int j=w.length()-1; j>i; j--) {
				char swapChar = chars[j];
				//System.out.println("2nd char at " + j + ": " + swapChar);
				
				if (swapChar > atPos) {
					chars[i] = swapChar;
					chars[j] = atPos;
					//System.out.println("moveBiggerCharBackword after swap: " + new String(chars));
					return moveSmallerCharBackword(new String(chars), i);
				}
			}
		}

		return "no answer";
	}

	private static String moveSmallerCharBackword(String w, int index) {
		//System.out.println("Word length: " + w.length());
		//System.out.println("Char swapped index: " + index + ", b4 moving smaller char: " + w);

		if (index == (w.length() - 2)) {
			//System.out.println("");
			return w;
		}

		char[] chars = w.toCharArray();

		for (int j = index + 1; j < chars.length; j++) {
			char lowestChar = chars[j];
			int swapIndex = -1;

			for (int k = j + 1; k < chars.length; k++) {
				if (lowestChar > chars[k]) {
					lowestChar = chars[k];
					swapIndex = k;
				}
			}

			if (swapIndex > 0) {
				char c = chars[j];
				chars[j] = chars[swapIndex];
				chars[swapIndex] = c;
			}
		}

		//System.out.println("After moving smaller char: " + new String(chars));
		return new String(chars);
	}
}
