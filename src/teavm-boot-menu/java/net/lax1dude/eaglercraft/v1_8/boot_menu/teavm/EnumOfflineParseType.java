package net.lax1dude.eaglercraft.v1_8.boot_menu.teavm;

/**
 * Copyright (c) 2024 lax1dude. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public enum EnumOfflineParseType {
	EAGLERCRAFTX_1_8_OFFLINE,
	EAGLERCRAFTX_1_8_SIGNED,
	EAGLERCRAFTX_1_8_FAT_OFFLINE,
	EAGLERCRAFTX_1_8_FAT_SIGNED,
	EAGLERCRAFT_1_5_NEW_OFFLINE,
	EAGLERCRAFT_1_5_OLD_OFFLINE,
	EAGLERCRAFT_BETA_B1_3_OFFLINE,
	PEYTONPLAYZ585_ALPHA_BETA,
	PEYTONPLAYZ585_INDEV,
	EXPORTED_STANDARD_OFFLINE,
	EAGLERCRAFT_EPK_FILE;

	public static EnumOfflineParseType inferFromClientFormat(EnumClientLaunchType etr) {
		switch(etr) {
		case STANDARD_OFFLINE_V1:
			return EXPORTED_STANDARD_OFFLINE;
		case EAGLERX_V1:
			return EAGLERCRAFTX_1_8_OFFLINE;
		case EAGLERX_SIGNED_V1:
			return EAGLERCRAFTX_1_8_SIGNED;
		case EAGLER_1_5_V1:
			return EAGLERCRAFT_1_5_OLD_OFFLINE;
		case EAGLER_1_5_V2:
			return EAGLERCRAFT_1_5_NEW_OFFLINE;
		case EAGLER_BETA_V1:
			return EAGLERCRAFT_BETA_B1_3_OFFLINE;
		case PEYTON_V1:
			return PEYTONPLAYZ585_INDEV;
		case PEYTON_V2:
			return PEYTONPLAYZ585_ALPHA_BETA;
		default:
			throw new IllegalArgumentException();
		}
	}
}
