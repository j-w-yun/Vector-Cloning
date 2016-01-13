package com.planner.data;

public final class Enzymes
{
	public static String getName(int index)
	{
		return DATA[index][0];
	}
	
	public static final String[][] DATA =
		{
			{ "AarI", "cacctgc", "11", "^nnnn", "4", "5", "false", "false" },
			{ "AatII", "gacgtc", "5", "acgt^", "4", "3", "true", "false" },
			{ "Acc65I", "ggtacc", "1", "^gtac", "4", "5", "true", "false" },
			{ "AccI", "gtmkac", "2", "^mk", "2", "5", "true", "true" },
			{ "AceIII", "cagctc", "13", "^nnnn", "4", "5", "false", "false" },
			{ "AciI", "ccgc", "1", "^cg", "2", "5", "false", "false" },
			{ "AclI", "aacgtt", "2", "^cg", "2", "5", "true", "false" },
			{ "AcuI", "ctgaag", "22", "nn^", "2", "3", "false", "false" },
			{ "AfeI", "agcgct", "3", "^", "0", "true", "false" },
			{ "AflII", "cttaag", "1", "^ttaa", "4", "5", "true", "false" },
			{ "AflIII", "acrygt", "1", "^cryg", "4", "5", "true", "true" },
			{ "AgeI", "accggt", "1", "^ccgg", "4", "5", "true", "false" },
			{ "AhdI", "gacnnnnngtc", "6", "n^", "1", "3", "true", "true" },
			{ "AleI", "cacnnnngtg", "5", "^", "0", "true", "true" },
			{ "AloI", "gaacnnnnnntcc", "25", "nnnnn^", "5", "3", "false", "true" },
			{ "AluI", "agct", "2", "^", "0", "true", "false" },
			{ "AlwI", "ggatc", "9", "^n", "1", "5", "false", "false" },
			{ "AlwNI", "cagnnnctg", "6", "nnn^", "3", "3", "true", "true" },
			{ "ApaBI", "gcannnnntgc", "8", "nnnnn^", "5", "3", "true", "true" },
			{ "ApaI", "gggccc", "5", "ggcc^", "4", "3", "true", "false" },
			{ "ApaLI", "gtgcac", "1", "^tgca", "4", "5", "true", "false" },
			{ "ApoI", "raatty", "1", "^aatt", "4", "5", "true", "true" },
			{ "AscI", "ggcgcgcc", "2", "^cgcg", "4", "5", "true", "false" },
			{ "AseI", "attaat", "2", "^ta", "2", "5", "true", "false" },
			{ "AsiSI", "gcgatcgc", "5", "at^", "2", "3", "true", "false" },
			{ "AvaI", "cycgrg", "1", "^ycgr", "4", "5", "true", "true" },
			{ "AvaII", "ggwcc", "1", "^gwc", "3", "5", "true", "true" },
			{ "AvrII", "cctagg", "1", "^ctag", "4", "5", "true", "false" },
			{ "BaeI", "acnnnngtayc", "23", "nnnnn^", "5", "3", "false", "true" },
			{ "BamHI", "ggatcc", "1", "^gatc", "4", "5", "true", "false" },
			{ "BanI", "ggyrcc", "1", "^gyrc", "4", "5", "true", "true" },
			{ "BanII", "grgcyc", "5", "rgcy^", "4", "3", "true", "true" },
			{ "BbeI", "ggcgcc", "5", "gcgc^", "4", "3", "true", "false" },
			{ "Bbr7I", "gaagac", "13", "^nnnn", "4", "5", "false", "false" },
			{ "BbsI", "gaagac", "8", "^nnnn", "4", "5", "false", "false" },
			{ "BbvCI", "cctcagc", "2", "^tca", "3", "5", "false", "false" },
			{ "BbvI", "gcagc", "13", "^nnnn", "4", "5", "false", "false" },
			{ "BccI", "ccatc", "9", "^n", "1", "5", "false", "false" },
			{ "BceAI", "acggc", "17", "^nn", "2", "5", "false", "false" },
			{ "BcefI", "acggc", "17", "^n", "1", "5", "false", "false" },
			{ "BcgI", "cgannnnnntgc", "24", "nn^", "2", "3", "false", "true" },
			{ "BciVI", "gtatcc", "12", "n^", "1", "3", "false", "false" },
			{ "BclI", "tgatca", "1", "^gatc", "4", "5", "true", "false" },
			{ "BfaI", "ctag", "1", "^ta", "2", "5", "true", "false" },
			{ "BfrBI", "atgcat", "3", "^", "0", "true", "false" },
			{ "BglI", "gccnnnnnggc", "7", "nnn^", "3", "3", "true", "true" },
			{ "BglII", "agatct", "1", "^gatc", "4", "5", "true", "false" },
			{ "BlpI", "gctnagc", "2", "^tna", "3", "5", "true", "true" },
			{ "Bme1580I", "gkgcmc", "5", "kgcm^", "4", "3", "true", "true" },
			{ "BmgBI", "cacgtc", "3", "^", "0", "false", "false" },
			{ "BmrI", "actggg", "11", "n^", "1", "3", "false", "false" },
			{ "BmtI", "gctagc", "5", "ctag^", "4", "3", "true", "false" },
			{ "BplI", "gagnnnnnctc", "24", "nnnnnnnnnnnnngagnnnnnctcnnnnnnnnnnnnn^", "37", "3", "true", "true" },
			{ "BpmI", "ctggag", "22", "nn^", "2", "3", "false", "false" },
			{ "Bpu10I", "cctnagc", "2", "^tna", "3", "5", "false", "true" },
			{ "BpuEI", "cttgag", "22", "nn^", "2", "3", "false", "false" },
			{ "BsaAI", "yacgtr", "3", "^", "0", "true", "true" },
			{ "BsaBI", "gatnnnnatc", "5", "^", "0", "true", "true" },
			{ "BsaHI", "grcgyc", "2", "^cg", "2", "5", "true", "true" },
			{ "BsaI", "ggtctc", "7", "^nnnn", "4", "5", "false", "false" },
			{ "BsaJI", "ccnngg", "1", "^cnng", "4", "5", "true", "true" },
			{ "BsaWI", "wccggw", "1", "^ccgg", "4", "5", "true", "true" },
			{ "BsaXI", "acnnnnnctcc", "21", "nnn^", "3", "3", "false", "true" },
			{ "BscAI", "gcatc", "9", "^nn", "2", "5", "false", "false" },
			{ "BseMII", "ctcag", "15", "nn^", "2", "3", "false", "false" },
			{ "BseRI", "gaggag", "16", "nn^", "2", "3", "false", "false" },
			{ "BseYI", "cccagc", "1", "^ccag", "4", "5", "false", "false" },
			{ "BsgI", "gtgcag", "22", "nn^", "2", "3", "false", "false" },
			{ "BsiEI", "cgrycg", "4", "ry^", "2", "3", "true", "true" },
			{ "BsiHKAI", "gwgcwc", "5", "wgcw^", "4", "3", "true", "true" },
			{ "BsiWI", "cgtacg", "1", "^gtac", "4", "5", "true", "false" },
			{ "BslI", "ccnnnnnnngg", "7", "nnn^", "3", "3", "true", "true" },
			{ "BsmAI", "gtctc", "6", "^nnnn", "4", "5", "false", "false" },
			{ "BsmBI", "cgtctc", "7", "^nnnn", "4", "5", "false", "false" },
			{ "BsmFI", "gggac", "15", "^nnnn", "4", "5", "false", "false" },
			{ "BsmI", "gaatgc", "7", "cn^", "2", "3", "false", "false" },
			{ "Bsp1286I", "gdgchc", "5", "dgch^", "4", "3", "true", "true" },
			{ "Bsp24I", "gacnnnnnntgg", "24", "nnnnn^", "5", "3", "false", "true" },
			{ "BspCNI", "ctcag", "14", "nn^", "2", "3", "false", "false" },
			{ "BspEI", "tccgga", "1", "^ccgg", "4", "5", "true", "false" },
			{ "BspHI", "tcatga", "1", "^catg", "4", "5", "true", "false" },
			{ "BspMI", "acctgc", "10", "^nnnn", "4", "5", "false", "false" },
			{ "BsrBI", "ccgctc", "3", "^", "0", "false", "false" },
			{ "BsrDI", "gcaatg", "8", "nn^", "2", "3", "false", "false" },
			{ "BsrFI", "rccggy", "1", "^ccgg", "4", "5", "true", "true" },
			{ "BsrGI", "tgtaca", "1", "^gtac", "4", "5", "true", "false" },
			{ "BsrI", "actgg", "6", "gn^", "2", "3", "false", "false" },
			{ "BssHII", "gcgcgc", "1", "^cgcg", "4", "5", "true", "false" },
			{ "BssSI", "cacgag", "1", "^acga", "4", "5", "false", "false" },
			{ "BstAPI", "gcannnnntgc", "7", "nnn^", "3", "3", "true", "true" },
			{ "BstBI", "ttcgaa", "2", "^cg", "2", "5", "true", "false" },
			{ "BstEII", "ggtnacc", "1", "^gtnac", "5", "5", "true", "true" },
			{ "BstF5I", "ggatg", "7", "nn^", "2", "3", "false", "false" },
			{ "BstKTI", "gatc", "3", "at^", "2", "3", "true", "false" },
			{ "BstNI", "ccwgg", "2", "^w", "1", "5", "true", "true" },
			{ "BstUI", "cgcg", "2", "^", "0", "true", "false" },
			{ "BstXI", "ccannnnnntgg", "8", "nnnn^", "4", "3", "true", "true" },
			{ "BstYI", "rgatcy", "1", "^gatc", "4", "5", "true", "true" },
			{ "BstZ17I", "gtatac", "3", "^", "0", "true", "false" },
			{ "Bsu36I", "cctnagg", "2", "^tna", "3", "5", "true", "true" },
			{ "BtgI", "ccrygg", "1", "^cryg", "4", "5", "true", "true" },
			{ "BthCI", "gcngc", "4", "cng^", "3", "3", "true", "true" },
			{ "BtsI", "gcagtg", "8", "nn^", "2", "3", "false", "false" },
			{ "Cac8I", "gcnngc", "3", "^", "0", "true", "true" },
			{ "CdiI", "catcg", "4", "^", "0", "false", "false" },
			{ "ChaI", "gatc", "4", "gatc^", "4", "3", "true", "false" },
			{ "CjeI", "ccannnnnngt", "26", "nnnnnn^", "6", "3", "false", "true" },
			{ "CjePI", "ccannnnnnntc", "26", "nnnnnn^", "6", "3", "false", "true" },
			{ "ClaI", "atcgat", "2", "^cg", "2", "5", "true", "false" },
			{ "Csp6I", "gtac", "1", "^ta", "2", "5", "true", "false" },
			{ "CviAII", "catg", "1", "^at", "2", "5", "true", "false" },
			{ "CviJI", "rgcy", "2", "^", "0", "true", "true" },
			{ "DdeI", "ctnag", "1", "^tna", "3", "5", "true", "true" },
			{ "DpnI", "gatc", "2", "^", "0", "true", "false" },
			{ "DraI", "tttaaa", "3", "^", "0", "true", "false" },
			{ "DraIII", "cacnnngtg", "6", "nnn^", "3", "3", "true", "true" },
			{ "DrdI", "gacnnnnnngtc", "7", "nn^", "2", "3", "true", "true" },
			{ "EaeI", "yggccr", "1", "^ggcc", "4", "5", "true", "true" },
			{ "EagI", "cggccg", "1", "^ggcc", "4", "5", "true", "false" },
			{ "EarI", "ctcttc", "7", "^nnn", "3", "5", "false", "false" },
			{ "EciI", "ggcgga", "17", "nn^", "2", "3", "false", "false" },
			{ "Eco57MI", "ctgrag", "22", "nn^", "2", "3", "false", "true" },
			{ "EcoHI", "ccsgg", "0", "^ccsgg", "5", "5", "true", "true" },
			{ "EcoICRI", "gagctc", "3", "^", "0", "true", "false" },
			{ "EcoNI", "cctnnnnnagg", "5", "^n", "1", "5", "true", "true" },
			{ "EcoO109I", "rggnccy", "2", "^gnc", "3", "5", "true", "true" },
			{ "EcoRI", "gaattc", "1", "^aatt", "4", "5", "true", "false" },
			{ "EcoRV", "gatatc", "3", "^", "0", "true", "false" },
			{ "EsaBC3I", "tcga", "2", "^", "0", "true", "false" },
			{ "FalI", "aagnnnnnctt", "24", "nnnnnnnnnnnnnaagnnnnncttnnnnnnnnnnnnn^", "37", "3", "true", "true" },
			{ "FatI", "catg", "0", "^catg", "4", "5", "true", "false" },
			{ "FauI", "cccgc", "9", "^nn", "2", "5", "true", "false" },
			{ "FmuI", "ggncc", "4", "gnc^", "3", "3", "true", "true" },
			{ "Fnu4HI", "gcngc", "2", "^n", "1", "5", "true", "true" },
			{ "FokI", "ggatg", "14", "^nnnn", "4", "5", "false", "false" },
			{ "FseI", "ggccggcc", "6", "ccgg^", "4", "3", "true", "false" },
			{ "FspAI", "rtgcgcay", "4", "^", "0", "true", "true" },
			{ "FspI", "tgcgca", "3", "^", "0", "true", "false" },
			{ "GdiII", "cggccr", "1", "^ggcc", "4", "5", "false", "true" },
			{ "HaeI", "wggccw", "3", "^", "0", "true", "true" },
			{ "HaeII", "rgcgcy", "5", "gcgc^", "4", "3", "true", "true" },
			{ "HaeIII", "ggcc", "2", "^", "0", "true", "false" },
			{ "HaeIV", "gaynnnnnrtc", "25", "nnnnnnnnnnnnnngaynnnnnrtcnnnnnnnnnnnnnn^", "39", "3", "true", "true" },
			{ "HgaI", "gacgc", "10", "^nnnnn", "5", "5", "false", "false" },
			{ "HhaI", "gcgc", "3", "cg^", "2", "3", "true", "false" },
			{ "Hin4I", "gaynnnnnvtc", "24", "nnnnn^", "5", "3", "false", "true" },
			{ "HincII", "gtyrac", "3", "^", "0", "true", "true" },
			{ "HindIII", "aagctt", "1", "^agct", "4", "5", "true", "false" },
			{ "HinfI", "gantc", "1", "^ant", "3", "5", "true", "true" },
			{ "HinP1I", "gcgc", "1", "^cg", "2", "5", "true", "false" },
			{ "HpaI", "gttaac", "3", "^", "0", "true", "false" },
			{ "HpaII", "ccgg", "1", "^cg", "2", "5", "true", "false" },
			{ "HphI", "ggtga", "13", "n^", "1", "3", "false", "false" },
			{ "Hpy188I", "tcnga", "3", "n^", "1", "3", "true", "true" },
			{ "Hpy188III", "tcnnga", "2", "^nn", "2", "5", "true", "true" },
			{ "Hpy8I", "gtnnac", "3", "^", "0", "true", "true" },
			{ "Hpy99I", "cgwcg", "5", "cgwcg^", "5", "3", "true", "true" },
			{ "HpyAV", "ccttc", "11", "n^", "1", "3", "false", "false" },
			{ "HpyCH4I", "catg", "3", "at^", "2", "3", "true", "false" },
			{ "HpyCH4III", "acngt", "3", "n^", "1", "3", "true", "true" },
			{ "HpyCH4IV", "acgt", "1", "^cg", "2", "5", "true", "false" },
			{ "HpyCH4V", "tgca", "2", "^", "0", "true", "false" },
			{ "HpyF10VI", "gcnnnnnnngc", "8", "nnnnn^", "5", "3", "true", "true" },
			{ "KasI", "ggcgcc", "1", "^gcgc", "4", "5", "true", "true" },
			{ "KpnI", "ggtacc", "5", "gtac^", "4", "3", "true", "false" },
			{ "LpnI", "rgcgcy", "3", "^", "0", "true", "true" },
			{ "MaeIII", "gtnac", "0", "^gtnac", "5", "5", "true", "true" },
			{ "MboI", "gatc", "0", "^gatc", "4", "5", "true", "false" },
			{ "MboII", "gaaga", "13", "n^", "1", "3", "false", "false" },
			{ "MfeI", "caattg", "1", "^aatt", "4", "5", "true", "false" },
			{ "MluI", "acgcgt", "1", "^cgcg", "4", "5", "true", "false" },
			{ "MlyI", "gagtc", "10", "^", "0", "false", "false" },
			{ "MmeI", "tccrac", "26", "nn^", "2", "3", "false", "true" },
			{ "MnlI", "cctc", "11", "n^", "1", "3", "false", "false" },
			{ "MscI", "tggcca", "3", "^", "0", "true", "false" },
			{ "MseI", "ttaa", "1", "^ta", "2", "5", "true", "false" },
			{ "MslI", "caynnnnrtg", "5", "^", "0", "true", "true" },
			{ "MspA1I", "cmgckg", "3", "^", "0", "true", "true" },
			{ "MwoI", "gcnnnnnnngc", "7", "nnn^", "3", "3", "true", "true" },
			{ "NaeI", "gccggc", "3", "^", "0", "true", "false" },
			{ "NarI", "ggcgcc", "2", "^cg", "2", "5", "true", "false" },
			{ "NciI", "ccsgg", "2", "^s", "1", "5", "true", "true" },
			{ "NcoI", "ccatgg", "1", "^catg", "4", "5", "true", "false" },
			{ "NdeI", "catatg", "2", "^ta", "2", "5", "true", "false" },
			{ "NgoMIV", "gccggc", "1", "^ccgg", "4", "5", "true", "false" },
			{ "NheI", "gctagc", "1", "^ctag", "4", "5", "true", "false" },
			{ "NlaIII", "catg", "4", "catg^", "4", "3", "true", "false" },
			{ "NlaIV", "ggnncc", "3", "^", "0", "true", "true" },
			{ "Nli3877I", "cycgrg", "5", "ycgr^", "4", "3", "true", "true" },
			{ "NotI", "gcggccgc", "2", "^ggcc", "4", "5", "true", "false" },
			{ "NruI", "tcgcga", "3", "^", "0", "true", "false" },
			{ "NsiI", "atgcat", "5", "tgca^", "4", "3", "true", "false" },
			{ "NspI", "rcatgy", "5", "catg^", "4", "3", "true", "true" },
			{ "PacI", "ttaattaa", "5", "at^", "2", "3", "true", "false" },
			{ "PciI", "acatgt", "1", "^catg", "4", "5", "true", "false" },
			{ "PflMI", "ccannnnntgg", "7", "nnn^", "3", "3", "true", "true" },
			{ "PfoI", "tccngga", "1", "^ccngg", "5", "5", "true", "true" },
			{ "PleI", "gagtc", "9", "^n", "1", "5", "false", "false" },
			{ "PmeI", "gtttaaac", "4", "^", "0", "true", "false" },
			{ "PmlI", "cacgtg", "3", "^", "0", "true", "false" },
			{ "PpiI", "gaacnnnnnctc", "25", "nnnnn^", "5", "3", "false", "true" },
			{ "Ppu10I", "atgcat", "1", "^tgca", "4", "5", "true", "false" },
			{ "PpuMI", "rggwccy", "2", "^gwc", "3", "5", "true", "true" },
			{ "PshAI", "gacnnnngtc", "5", "^", "0", "true", "true" },
			{ "PsiI", "ttataa", "3", "^", "0", "true", "false" },
			{ "Psp03I", "ggwcc", "4", "gwc^", "3", "3", "true", "true" },
			{ "PspGI", "ccwgg", "0", "^ccwgg", "5", "5", "true", "true" },
			{ "PspOMI", "gggccc", "1", "^ggcc", "4", "5", "true", "false" },
			{ "PsrI", "gaacnnnnnntac", "25", "nnnnn^", "5", "3", "false", "true" },
			{ "PssI", "rggnccy", "5", "gnc^", "3", "3", "true", "true" },
			{ "PstI", "ctgcag", "5", "tgca^", "4", "3", "true", "false" },
			{ "PvuI", "cgatcg", "4", "at^", "2", "3", "true", "false" },
			{ "PvuII", "cagctg", "3", "^", "0", "true", "false" },
			{ "RleAI", "cccaca", "18", "nnn^", "3", "3", "false", "false" },
			{ "RsaI", "gtac", "2", "^", "0", "true", "false" },
			{ "RsrII", "cggwccg", "2", "^gwc", "3", "5", "true", "true" },
			{ "SacI", "gagctc", "5", "agct^", "4", "3", "true", "false" },
			{ "SacII", "ccgcgg", "4", "gc^", "2", "3", "true", "false" },
			{ "SalI", "gtcgac", "1", "^tcga", "4", "5", "true", "false" },
			{ "SanDI", "gggwccc", "2", "^gwc", "3", "5", "true", "true" },
			{ "SapI", "gctcttc", "8", "^nnn", "3", "5", "false", "false" },
			{ "Sau96I", "ggncc", "1", "^gnc", "3", "5", "true", "true" },
			{ "SbfI", "cctgcagg", "6", "tgca^", "4", "3", "true", "false" },
			{ "ScaI", "agtact", "3", "^", "0", "true", "false" },
			{ "SciI", "ctcgag", "3", "^", "0", "true", "false" },
			{ "ScrFI", "ccngg", "2", "^n", "1", "5", "true", "true" },
			{ "SelI", "cgcg", "0", "^cgcg", "4", "5", "true", "false" },
			{ "SexAI", "accwggt", "1", "^ccwgg", "5", "5", "true", "true" },
			{ "SfaNI", "gcatc", "10", "^nnnn", "4", "5", "false", "false" },
			{ "SfcI", "ctryag", "1", "^trya", "4", "5", "true", "true" },
			{ "SfiI", "ggccnnnnnggcc", "8", "nnn^", "3", "3", "true", "true" },
			{ "SfoI", "ggcgcc", "3", "^", "0", "true", "false" },
			{ "SgrAI", "crccggyg", "2", "^ccgg", "4", "5", "true", "true" },
			{ "SimI", "gggtc", "2", "^gtc", "3", "5", "false", "false" },
			{ "SmaI", "cccggg", "3", "^", "0", "true", "false" },
			{ "SmlI", "ctyrag", "1", "^tyra", "4", "5", "true", "true" },
			{ "SnaBI", "tacgta", "3", "^", "0", "true", "false" },
			{ "SpeI", "actagt", "1", "^ctag", "4", "5", "true", "false" },
			{ "SphI", "gcatgc", "5", "catg^", "4", "3", "true", "false" },
			{ "SrfI", "gcccgggc", "4", "^", "0", "true", "false" },
			{ "Sse232I", "cgccggcg", "2", "^ccgg", "4", "5", "true", "false" },
			{ "Sse8647I", "aggwcct", "2", "^gwc", "3", "5", "true", "true" },
			{ "SspD5I", "ggtga", "13", "^", "0", "false", "false" },
			{ "SspI", "aatatt", "3", "^", "0", "true", "false" },
			{ "Sth132I", "cccg", "8", "^nnnn", "4", "5", "false", "false" },
			{ "StsI", "ggatg", "15", "^nnnn", "4", "5", "false", "false" },
			{ "StuI", "aggcct", "3", "^", "0", "true", "false" },
			{ "StyD4I", "ccngg", "0", "^ccngg", "5", "5", "true", "true" },
			{ "StyI", "ccwwgg", "1", "^cwwg", "4", "5", "true", "true" },
			{ "SwaI", "atttaaat", "4", "^", "0", "true", "false" },
			{ "TaiI", "acgt", "4", "acgt^", "4", "3", "true", "false" },
			{ "TaqI", "tcga", "1", "^cg", "2", "5", "true", "false" },
			{ "TaqII", "gaccga", "17", "nn^", "2", "3", "false", "false" },
			{ "TatI", "wgtacw", "1", "^gtac", "4", "5", "true", "true" },
			{ "TauI", "gcsgc", "4", "csg^", "3", "3", "true", "true" },
			{ "TfiI", "gawtc", "1", "^awt", "3", "5", "true", "true" },
			{ "TseI", "gcwgc", "1", "^cwg", "3", "5", "true", "true" },
			{ "Tsp45I", "gtsac", "0", "^gtsac", "5", "5", "true", "true" },
			{ "Tsp509I", "aatt", "0", "^aatt", "4", "5", "true", "false" },
			{ "TspDTI", "atgaa", "16", "nn^", "2", "3", "false", "false" },
			{ "TspGWI", "acgga", "16", "nn^", "2", "3", "false", "false" },
			{ "TspRI", "castg", "7", "nncastgnn^", "9", "3", "true", "true" },
			{ "Tth111I", "gacnnngtc", "4", "^n", "1", "5", "true", "true" },
			{ "Tth111II", "caarca", "17", "nn^", "2", "3", "false", "true" },
			{ "UnbI", "ggncc", "0", "^ggncc", "5", "5", "true", "true" },
			{ "UthSI", "cccggg", "2", "^cg", "2", "5", "true", "false" },
			{ "VpaK11AI", "ggwcc", "0", "^ggwcc", "5", "5", "true", "true" },
			{ "XbaI", "tctaga", "1", "^ctag", "4", "5", "true", "false" },
			{ "XcmI", "ccannnnnnnnntgg", "8", "n^", "1", "3", "true", "true" },
			{ "XhoI", "ctcgag", "1", "^tcga", "4", "5", "true", "false" },
			{ "XmaI", "cccggg", "1", "^ccgg", "4", "5", "true", "false" },
			{ "XmnI", "gaannnnttc", "5", "^", "0", "true", "true" },
			{ "ZraI", "gacgtc", "3", "^", "0", "true", "false" }
		};
}

//AarI	[cacctgc]	11	(^nnnn)	4/5;	false.false
//AatII	[gacgtc]	5	(acgt^) 4/3;	true.false
//Acc65I	[ggtacc]	1	(^gtac)	4/5;	true.false
//AccI	[gtmkac]	2	(^mk)	2/5;	true.true
//AceIII	[cagctc]	13	(^nnnn)	4/5;	false.false
//AciI	[ccgc]	1	(^cg)	2/5;	false.false
//AclI	[aacgtt]	2	(^cg)	2/5	true.false
//AcuI	[ctgaag]	22	(nn^)	2/3	false.false
//AfeI	[agcgct]	3	(^)	0	true.false
//AflII	[cttaag]	1	(^ttaa)	4/5	true.false
//AflIII	[acrygt]	1	(^cryg)	4/5	true.true
//AgeI	[accggt]	1	(^ccgg)	4/5	true.false
//AhdI	[gacnnnnngtc]	6	(n^)	1/3	true.true
//AleI	[cacnnnngtg]	5	(^)	0	true.true
//AloI	[gaacnnnnnntcc]	25	(nnnnn^)	5/3	false.true
//AluI	[agct]	2	(^)	0	true.false
//AlwI	[ggatc]	9	(^n)	1/5	false.false
//AlwNI	[cagnnnctg]	6	(nnn^)	3/3	true.true
//ApaBI	[gcannnnntgc]	8	(nnnnn^)	5/3	true.true
//ApaI	[gggccc]	5	(ggcc^)	4/3	true.false
//ApaLI	[gtgcac]	1	(^tgca)	4/5	true.false
//ApoI	[raatty]	1	(^aatt)	4/5	true.true
//AscI	[ggcgcgcc]	2	(^cgcg)	4/5	true.false
//AseI	[attaat]	2	(^ta)	2/5	true.false
//AsiSI	[gcgatcgc]	5	(at^)	2/3	true.false
//AvaI	[cycgrg]	1	(^ycgr)	4/5	true.true
//AvaII	[ggwcc]	1	(^gwc)	3/5	true.true
//AvrII	[cctagg]	1	(^ctag)	4/5	true.false
//BaeI	[acnnnngtayc]	23	(nnnnn^)	5/3	false.true
//BamHI	[ggatcc]	1	(^gatc)	4/5	true.false
//BanI	[ggyrcc]	1	(^gyrc)	4/5	true.true
//BanII	[grgcyc]	5	(rgcy^)	4/3	true.true
//BbeI	[ggcgcc]	5	(gcgc^)	4/3	true.false
//Bbr7I	[gaagac]	13	(^nnnn)	4/5	false.false
//BbsI	[gaagac]	8	(^nnnn)	4/5	false.false
//BbvCI	[cctcagc]	2	(^tca)	3/5	false.false
//BbvI	[gcagc]	13	(^nnnn)	4/5	false.false
//BccI	[ccatc]	9	(^n)	1/5	false.false
//BceAI	[acggc]	17	(^nn)	2/5	false.false
//BcefI	[acggc]	17	(^n)	1/5	false.false
//BcgI	[cgannnnnntgc]	24	(nn^)	2/3	false.true
//BciVI	[gtatcc]	12	(n^)	1/3	false.false
//BclI	[tgatca]	1	(^gatc)	4/5	true.false
//BfaI	[ctag]	1	(^ta)	2/5	true.false
//BfrBI	[atgcat]	3	(^)	0	true.false
//BglI	[gccnnnnnggc]	7	(nnn^)	3/3	true.true
//BglII	[agatct]	1	(^gatc)	4/5	true.false
//BlpI	[gctnagc]	2	(^tna)	3/5	true.true
//Bme1580I	[gkgcmc]	5	(kgcm^)	4/3	true.true
//BmgBI	[cacgtc]	3	(^)	0	false.false
//BmrI	[actggg]	11	(n^)	1/3	false.false
//BmtI	[gctagc]	5	(ctag^)	4/3	true.false
//BplI	[gagnnnnnctc]	24	(nnnnnnnnnnnnngagnnnnnctcnnnnnnnnnnnnn^)	37/3	true.true
//BpmI	[ctggag]	22	(nn^)	2/3	false.false
//Bpu10I	[cctnagc]	2	(^tna)	3/5	false.true
//BpuEI	[cttgag]	22	(nn^)	2/3	false.false
//BsaAI	[yacgtr]	3	(^)	0	true.true
//BsaBI	[gatnnnnatc]	5	(^)	0	true.true
//BsaHI	[grcgyc]	2	(^cg)	2/5	true.true
//BsaI	[ggtctc]	7	(^nnnn)	4/5	false.false
//BsaJI	[ccnngg]	1	(^cnng)	4/5	true.true
//BsaWI	[wccggw]	1	(^ccgg)	4/5	true.true
//BsaXI	[acnnnnnctcc]	21	(nnn^)	3/3	false.true
//BscAI	[gcatc]	9	(^nn)	2/5	false.false
//BseMII	[ctcag]	15	(nn^)	2/3	false.false
//BseRI	[gaggag]	16	(nn^)	2/3	false.false
//BseYI	[cccagc]	1	(^ccag)	4/5	false.false
//BsgI	[gtgcag]	22	(nn^)	2/3	false.false
//BsiEI	[cgrycg]	4	(ry^)	2/3	true.true
//BsiHKAI	[gwgcwc]	5	(wgcw^)	4/3	true.true
//BsiWI	[cgtacg]	1	(^gtac)	4/5	true.false
//BslI	[ccnnnnnnngg]	7	(nnn^)	3/3	true.true
//BsmAI	[gtctc]	6	(^nnnn)	4/5	false.false
//BsmBI	[cgtctc]	7	(^nnnn)	4/5	false.false
//BsmFI	[gggac]	15	(^nnnn)	4/5	false.false
//BsmI	[gaatgc]	7	(cn^)	2/3	false.false
//Bsp1286I	[gdgchc]	5	(dgch^)	4/3	true.true
//Bsp24I	[gacnnnnnntgg]	24	(nnnnn^)	5/3	false.true
//BspCNI	[ctcag]	14	(nn^)	2/3	false.false
//BspEI	[tccgga]	1	(^ccgg)	4/5	true.false
//BspHI	[tcatga]	1	(^catg)	4/5	true.false
//BspMI	[acctgc]	10	(^nnnn)	4/5	false.false
//BsrBI	[ccgctc]	3	(^)	0	false.false
//BsrDI	[gcaatg]	8	(nn^)	2/3	false.false
//BsrFI	[rccggy]	1	(^ccgg)	4/5	true.true
//BsrGI	[tgtaca]	1	(^gtac)	4/5	true.false
//BsrI	[actgg]	6	(gn^)	2/3	false.false
//BssHII	[gcgcgc]	1	(^cgcg)	4/5	true.false
//BssSI	[cacgag]	1	(^acga)	4/5	false.false
//BstAPI	[gcannnnntgc]	7	(nnn^)	3/3	true.true
//BstBI	[ttcgaa]	2	(^cg)	2/5	true.false
//BstEII	[ggtnacc]	1	(^gtnac)	5/5	true.true
//BstF5I	[ggatg]	7	(nn^)	2/3	false.false
//BstKTI	[gatc]	3	(at^)	2/3	true.false
//BstNI	[ccwgg]	2	(^w)	1/5	true.true
//BstUI	[cgcg]	2	(^)	0	true.false
//BstXI	[ccannnnnntgg]	8	(nnnn^)	4/3	true.true
//BstYI	[rgatcy]	1	(^gatc)	4/5	true.true
//BstZ17I	[gtatac]	3	(^)	0	true.false
//Bsu36I	[cctnagg]	2	(^tna)	3/5	true.true
//BtgI	[ccrygg]	1	(^cryg)	4/5	true.true
//BthCI	[gcngc]	4	(cng^)	3/3	true.true
//BtsI	[gcagtg]	8	(nn^)	2/3	false.false
//Cac8I	[gcnngc]	3	(^)	0	true.true
//CdiI	[catcg]	4	(^)	0	false.false
//ChaI	[gatc]	4	(gatc^)	4/3	true.false
//CjeI	[ccannnnnngt]	26	(nnnnnn^)	6/3	false.true
//CjePI	[ccannnnnnntc]	26	(nnnnnn^)	6/3	false.true
//ClaI	[atcgat]	2	(^cg)	2/5	true.false
//Csp6I	[gtac]	1	(^ta)	2/5	true.false
//CviAII	[catg]	1	(^at)	2/5	true.false
//CviJI	[rgcy]	2	(^)	0	true.true
//DdeI	[ctnag]	1	(^tna)	3/5	true.true
//DpnI	[gatc]	2	(^)	0	true.false
//DraI	[tttaaa]	3	(^)	0	true.false
//DraIII	[cacnnngtg]	6	(nnn^)	3/3	true.true
//DrdI	[gacnnnnnngtc]	7	(nn^)	2/3	true.true
//EaeI	[yggccr]	1	(^ggcc)	4/5	true.true
//EagI	[cggccg]	1	(^ggcc)	4/5	true.false
//EarI	[ctcttc]	7	(^nnn)	3/5	false.false
//EciI	[ggcgga]	17	(nn^)	2/3	false.false
//Eco57MI	[ctgrag]	22	(nn^)	2/3	false.true
//EcoHI	[ccsgg]	0	(^ccsgg)	5/5	true.true
//EcoICRI	[gagctc]	3	(^)	0	true.false
//EcoNI	[cctnnnnnagg]	5	(^n)	1/5	true.true
//EcoO109I	[rggnccy]	2	(^gnc)	3/5	true.true
//EcoRI	[gaattc]	1	(^aatt)	4/5	true.false
//EcoRV	[gatatc]	3	(^)	0	true.false
//EsaBC3I	[tcga]	2	(^)	0	true.false
//FalI	[aagnnnnnctt]	24	(nnnnnnnnnnnnnaagnnnnncttnnnnnnnnnnnnn^)	37/3	true.true
//FatI	[catg]	0	(^catg)	4/5 true.false
//FauI	[cccgc]	9	(^nn)	2/5	true.false
//FmuI	[ggncc]	4	(gnc^)	3/3	true.true
//Fnu4HI	[gcngc]	2	(^n)	1/5	true.true
//FokI	[ggatg]	14	(^nnnn)	4/5	false.false
//FseI	[ggccggcc]	6	(ccgg^)	4/3	true.false
//FspAI	[rtgcgcay]	4	(^)	0	true.true
//FspI	[tgcgca]	3	(^)	0	true.false
//GdiII	[cggccr]	1	(^ggcc)	4/5	false.true
//HaeI	[wggccw]	3	(^)	0	true.true
//HaeII	[rgcgcy]	5	(gcgc^)	4/3	true.true
//HaeIII	[ggcc]	2	(^)	0	true.false
//HaeIV	[gaynnnnnrtc]	25	(nnnnnnnnnnnnnngaynnnnnrtcnnnnnnnnnnnnnn^)	39/3	true.true
//HgaI	[gacgc]	10	(^nnnnn)	5/5	false.false
//HhaI	[gcgc]	3	(cg^)	2/3	true.false
//Hin4I	[gaynnnnnvtc]	24	(nnnnn^)	5/3	false.true
//HincII	[gtyrac]	3	(^)	0	true.true
//HindIII	[aagctt]	1	(^agct)	4/5	true.false
//HinfI	[gantc]	1	(^ant)	3/5	true.true
//HinP1I	[gcgc]	1	(^cg)	2/5	true.false
//HpaI	[gttaac]	3	(^)	0	true.false
//HpaII	[ccgg]	1	(^cg)	2/5	true.false
//HphI	[ggtga]	13	(n^)	1/3	false.false
//Hpy188I	[tcnga]	3	(n^)	1/3	true.true
//Hpy188III	[tcnnga]	2	(^nn)	2/5	true.true
//Hpy8I	[gtnnac]	3	(^)	0	true.true
//Hpy99I	[cgwcg]	5	(cgwcg^)	5/3	true.true
//HpyAV	[ccttc]	11	(n^)	1/3	false.false
//HpyCH4I	[catg]	3	(at^)	2/3	true.false
//HpyCH4III	[acngt]	3	(n^)	1/3	true.true
//HpyCH4IV	[acgt]	1	(^cg)	2/5	true.false
//HpyCH4V	[tgca]	2	(^)	0	true.false
//HpyF10VI	[gcnnnnnnngc]	8	(nnnnn^)	5/3	true.true
//KasI	[ggcgcc]	1	(^gcgc)	4/5	true.true
//KpnI	[ggtacc]	5	(gtac^)	4/3	true.false
//LpnI	[rgcgcy]	3	(^)	0	true.true
//MaeIII	[gtnac]	0	(^gtnac)	5/5	true.true
//MboI	[gatc]	0	(^gatc)	4/5	true.false
//MboII	[gaaga]	13	(n^)	1/3	false.false
//MfeI	[caattg]	1	(^aatt)	4/5	true.false
//MluI	[acgcgt]	1	(^cgcg)	4/5	true.false
//MlyI	[gagtc]	10	(^)	0	false.false
//MmeI	[tccrac]	26	(nn^)	2/3	false.true
//MnlI	[cctc]	11	(n^)	1/3	false.false
//MscI	[tggcca]	3	(^)	0	true.false
//MseI	[ttaa]	1	(^ta)	2/5	true.false
//MslI	[caynnnnrtg]	5	(^)	0	true.true
//MspA1I	[cmgckg]	3	(^)	0	true.true
//MwoI	[gcnnnnnnngc]	7	(nnn^)	3/3	true.true
//NaeI	[gccggc]	3	(^)	0	true.false
//NarI	[ggcgcc]	2	(^cg)	2/5	true.false
//NciI	[ccsgg]	2	(^s)	1/5	true.true
//NcoI	[ccatgg]	1	(^catg)	4/5	true.false
//NdeI	[catatg]	2	(^ta)	2/5	true.false
//NgoMIV	[gccggc]	1	(^ccgg)	4/5	true.false
//NheI	[gctagc]	1	(^ctag)	4/5	true.false
//NlaIII	[catg]	4	(catg^)	4/3	true.false
//NlaIV	[ggnncc]	3	(^)	0	true.true
//Nli3877I	[cycgrg]	5	(ycgr^)	4/3	true.true
//NotI	[gcggccgc]	2	(^ggcc)	4/5	true.false
//NruI	[tcgcga]	3	(^)	0	true.false
//NsiI	[atgcat]	5	(tgca^)	4/3	true.false
//NspI	[rcatgy]	5	(catg^)	4/3	true.true
//PacI	[ttaattaa]	5	(at^)	2/3	true.false
//PciI	[acatgt]	1	(^catg)	4/5	true.false
//PflMI	[ccannnnntgg]	7	(nnn^)	3/3	true.true
//PfoI	[tccngga]	1	(^ccngg)	5/5	true.true
//PleI	[gagtc]	9	(^n)	1/5 false.false
//PmeI	[gtttaaac]	4	(^)	0	true.false
//PmlI	[cacgtg]	3	(^)	0	true.false
//PpiI	[gaacnnnnnctc]	25	(nnnnn^)	5/3	false.true
//Ppu10I	[atgcat]	1	(^tgca)	4/5	true.false
//PpuMI	[rggwccy]	2	(^gwc)	3/5	true.true
//PshAI	[gacnnnngtc]	5	(^)	0	true.true
//PsiI	[ttataa]	3	(^)	0	true.false
//Psp03I	[ggwcc]	4	(gwc^)	3/3	true.true
//PspGI	[ccwgg]	0	(^ccwgg)	5/5	true.true
//PspOMI	[gggccc]	1	(^ggcc)	4/5	true.false
//PsrI	[gaacnnnnnntac]	25	(nnnnn^)	5/3	false.true
//PssI	[rggnccy]	5	(gnc^)	3/3	true.true
//PstI	[ctgcag]	5	(tgca^)	4/3	true.false
//PvuI	[cgatcg]	4	(at^)	2/3	true.false
//PvuII	[cagctg]	3	(^)	0	true.false
//RleAI	[cccaca]	18	(nnn^)	3/3	false.false
//RsaI	[gtac]	2	(^)	0	true.false
//RsrII	[cggwccg]	2	(^gwc)	3/5	true.true
//SacI	[gagctc]	5	(agct^)	4/3	true.false
//SacII	[ccgcgg]	4	(gc^)	2/3	true.false
//SalI	[gtcgac]	1	(^tcga)	4/5	true.false
//SanDI	[gggwccc]	2	(^gwc)	3/5	true.true
//SapI	[gctcttc]	8	(^nnn)	3/5	false.false
//Sau96I	[ggncc]	1	(^gnc)	3/5	true.true
//SbfI [cctgcagg]	6	(tgca^)	4/3	true.false
//ScaI	[agtact]	3	(^) 0 true.false
//SciI	[ctcgag]	3	(^)	0	true.false
//ScrFI	[ccngg]	2	(^n)	1/5	true.true
//SelI	[cgcg]	0	(^cgcg) 4/5	true.false
//SexAI	[accwggt]	1	(^ccwgg)	5/5	true.true
//SfaNI	[gcatc]	10	(^nnnn)	4/5	false.false
//SfcI	[ctryag]	1	(^trya)	4/5	true.true
//SfiI	[ggccnnnnnggcc]	8	(nnn^)	3/3	true.true
//SfoI	[ggcgcc]	3	(^)	0	true.false
//SgrAI	[crccggyg]	2	(^ccgg)	4/5	true.true
//SimI	[gggtc]	2	(^gtc)	3/5	false.false
//SmaI	[cccggg]	3	(^)	0	true.false
//SmlI	[ctyrag]	1	(^tyra)	4/5	true.true
//SnaBI	[tacgta]	3	(^)	0	true.false
//SpeI	[actagt]	1	(^ctag)	4/5	true.false
//SphI	[gcatgc]	5	(catg^)	4/3 true.false
//SrfI	[gcccgggc]	4	(^)	0	true.false
//Sse232I	[cgccggcg]	2	(^ccgg)	4/5	true.false
//Sse8647I	[aggwcct]	2	(^gwc)	3/5	true.true
//SspD5I	[ggtga]	13	(^)	0	false.false
//SspI	[aatatt]	3	(^)	0	true.false
//Sth132I	[cccg]	8	(^nnnn)	4/5	false.false
//StsI	[ggatg]	15	(^nnnn)	4/5	false.false
//StuI	[aggcct]	3	(^)	0	true.false
//StyD4I	[ccngg]	0	(^ccngg)	5/5	true.true
//StyI	[ccwwgg]	1	(^cwwg)	4/5	true.true
//SwaI	[atttaaat]	4	(^)	0	true.false
//TaiI	[acgt]	4	(acgt^)	4/3	true.false
//TaqI	[tcga]	1	(^cg)	2/5	true.false
//TaqII	[gaccga]	17	(nn^)	2/3	false.false
//TatI	[wgtacw]	1	(^gtac)	4/5	true.true
//TauI	[gcsgc]	4	(csg^)	3/3	true.true
//TfiI	[gawtc]	1	(^awt)	3/5	true.true
//TseI	[gcwgc]	1	(^cwg)	3/5	true.true
//Tsp45I	[gtsac]	0	(^gtsac)	5/5	true.true
//Tsp509I [aatt]	0	(^aatt)	4/5	true.false
//TspDTI	[atgaa]	16	(nn^)	2/3	false.false
//TspGWI	[acgga]	16	(nn^)	2/3	false.false
//TspRI	[castg]	7	(nncastgnn^)	9/3	true.true
//Tth111I	[gacnnngtc]	4	(^n)	1/5	true.true
//Tth111II	[caarca]	17	(nn^)	2/3	false.true
//UnbI	[ggncc]	0	(^ggncc)	5/5	true.true
//UthSI	[cccggg]	2	(^cg)	2/5	true.false
//VpaK11AI	[ggwcc]	0	(^ggwcc)	5/5	true.true
//XbaI	[tctaga]	1	(^ctag)	4/5	true.false
//XcmI	[ccannnnnnnnntgg]	8	(n^)	1/3	true.true
//XhoI	[ctcgag]	1	(^tcga)	4/5	true.false
//XmaI	[cccggg]	1	(^ccgg)	4/5	true.false
//XmnI	[gaannnnttc]	5	(^)	0	true.true
//ZraI	[gacgtc]	3	(^)	0	true.false